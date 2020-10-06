package org.pmt.model;

import org.json.JSONArray;
import org.json.JSONObject;
import org.pmt.util.DateCategorization;

import java.time.LocalDateTime;
import java.util.*;

public class CommitDateCategory {

    private final DateCategorization dateCategorization = new DateCategorization();
    private final String TITLE = "Commit ";
    private final String SUBTITLE = "(Latest 100 commits)";
    private final String AXIS_Y_TITLE = "No. of Commits";

    private JSONArray dataList;
    private String title;
    private String subtitle;
    private String axisYLabel;

    public CommitDateCategory() {
        this.title = TITLE;
        this.subtitle = SUBTITLE;
        this.axisYLabel = AXIS_Y_TITLE;
    }

    public CommitDateCategory(List<LocalDateTime> localDateTimeList) {
        this.title = TITLE;
        this.subtitle = SUBTITLE;
        this.axisYLabel = AXIS_Y_TITLE;
        this.dataList = dateCategorization.categorizeDateList(localDateTimeList);
    }

    public JSONArray getDataList() {
        return dataList;
    }

    public void setDataList(JSONArray dataList) {
        this.dataList = dataList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAxisYLabel() {
        return axisYLabel;
    }

    public void setAxisYLabel(String axisYLabel) {
        this.axisYLabel = axisYLabel;
    }

    @Override
    public String toString() {
        return "CommitDateCategory{" +
                "dataList=" + dataList +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", axisYLabel='" + axisYLabel + '\'' +
                '}';
    }
}