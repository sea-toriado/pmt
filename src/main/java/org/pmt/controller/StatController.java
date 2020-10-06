package org.pmt.controller;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.pmt.model.*;
import org.pmt.util.HttpRequestUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@WebServlet(name = "StatController", urlPatterns = {"/stat"})
public class StatController extends HttpServlet {

    private final String STAT_JSP = "/WEB-INF/jsp/stat.jsp";
    private final HttpRequestUtil httpRequestUtil = new HttpRequestUtil();

    public void init() throws ServletException{
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String owner = (String)req.getParameter("owner");
        String repo = (String)req.getParameter("repo");

        List<Committer> committerList = new ArrayList<>();
        URL url = new URL("https://api.github.com/repos/" + owner + "/" + repo + "/commits");
        String commitStr = httpRequestUtil.requestHttp(url, "GET");

        List<Committer> committers = getUniqueCommitters(commitStr);
        List<LocalDateTime> localDateTimeList = getLatestCommitDates(commitStr);

        req.setAttribute("projectName", repo);
        req.setAttribute("committers", committers);
        req.setAttribute("commitForecast", new CommitDateCategory(localDateTimeList));

        dispatch(req, resp, STAT_JSP);
    }

    // Forwards to JSP page
    protected void dispatch(HttpServletRequest request, HttpServletResponse response, String page) throws  javax.servlet.ServletException, java.io.IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }

    private List<Committer> getUniqueCommitters(String requestResponse) throws IOException {
        List<Committer> committerList = new ArrayList<>();
        if(!Objects.isNull(requestResponse)) {
            JSONArray responseArr = new JSONArray(requestResponse);
            Integer commitCount = responseArr.length();
            if(commitCount > 100) {
                commitCount = 100;
                JSONArray sortedCommitArr = new JSONArray();
                for (int i = responseArr.length()-1 ; i >= 0 ; i--) {
                    sortedCommitArr.put(responseArr.get(i));
                }
                responseArr = sortedCommitArr;
            }
            Double finalCommitCount = Double.valueOf(commitCount);
            for(int counter = 0 ; counter < responseArr.length() ; counter++) {
                JSONObject commitJsonObj = responseArr.getJSONObject(counter);
                if(!commitJsonObj.isNull("commit")) {
                    Commit commit = new Commit(commitJsonObj.getJSONObject("commit"));
                    if(!Objects.isNull(commit.getCommitter())) {
                        if(committerList
                                .stream()
                                .filter(c -> c.getEmail().equals(commit.getCommitter().getEmail()))
                                .count() == 0
                        ) {
                            if(counter < 100) {
                                commit.getCommitter().setCommitCount(1);
                                commit.getCommitter().setCommitImpact(1.0/ finalCommitCount);
                            }
                            committerList.add(commit.getCommitter());
                        } else if(counter < 100) {
                            committerList
                                    .stream()
                                    .filter(c -> c.getEmail().equals(commit.getCommitter().getEmail()))
                                    .forEach(committer -> {
                                        committer.setCommitCount(committer.getCommitCount() + 1);
                                        committer.setCommitImpact(Double.valueOf(committer.getCommitCount()/ finalCommitCount));
                                    });
                        }
                    }
                }
            }
        }
        return committerList;
    }

    private List<LocalDateTime> getLatestCommitDates(String requestResponse) {
        List<LocalDateTime> monthlyCommitResult = new ArrayList();
        if(!Objects.isNull(requestResponse)) {
            List<LocalDateTime> localDateTimeList = new ArrayList<>();
            JSONArray responseArr = new JSONArray(requestResponse);
            Integer commitCount = responseArr.length();
            if(commitCount > 100) {
                commitCount = 100;
                JSONArray sortedCommitArr = new JSONArray();
                for (int i = responseArr.length()-1 ; i >= 0 && sortedCommitArr.length() <= 100; i--) {
                    sortedCommitArr.put(responseArr.get(i));
                }
                responseArr = sortedCommitArr;
            }
            responseArr.forEach(responseItem -> {
                JSONObject commitJsonObj = new JSONObject(responseItem.toString());
                if(!commitJsonObj.isNull("commit")) {
                    Commit commit = new Commit(commitJsonObj.getJSONObject("commit"));
                    if(!Objects.isNull(commit.getCommitter())) {
                        localDateTimeList.add(commit.getCommitter().getDate());
                    } else if(!Objects.isNull(commit.getAuthor())) {
                        localDateTimeList.add(commit.getAuthor().getDate());
                    }
                }
            });
            if(localDateTimeList.size() > 0) {
                monthlyCommitResult = localDateTimeList;
            }
        }
        return monthlyCommitResult;
    }


}
