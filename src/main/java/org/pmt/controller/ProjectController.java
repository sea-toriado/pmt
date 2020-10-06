package org.pmt.controller;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.pmt.model.Project;
import org.pmt.model.SearchResult;
import org.pmt.util.HttpRequestUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@WebServlet(name = "ProjectController", urlPatterns = {"/project"})
public class ProjectController extends HttpServlet {

    private final String PROJECT_JSP = "/WEB-INF/jsp/project.jsp";
    private final HttpRequestUtil httpRequestUtil = new HttpRequestUtil();

    public void init() throws ServletException{
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Project> projectList = new ArrayList<>();
        String searchKeyword = (String)req.getParameter("searchKeyword");
        URL url = new URL("https://api.github.com/search/repositories?q=" + searchKeyword.replaceAll(" ", "+"));
        String httpResponse = httpRequestUtil.requestHttp(url, "GET");
        if(!Objects.isNull(httpResponse)) {
            SearchResult searchResult = new SearchResult(new JSONObject(httpResponse));
            if(!Objects.isNull(searchResult.getItems()) && searchResult.getItems().size() > 0) {
                projectList = searchResult.getItems();
            }
        }
        req.setAttribute("projects", projectList);
        dispatch(req, resp, PROJECT_JSP);
    }

    // Forwards to JSP page
    protected void dispatch(HttpServletRequest request, HttpServletResponse response, String page) throws  javax.servlet.ServletException, java.io.IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }
}
