package org.pmt.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {

    private Integer totalCount;
    private Boolean incompleteResults;
    private List<Project> items;

    public SearchResult() { }

    public SearchResult(JSONObject jsonObject) {
        this.totalCount = !jsonObject.isNull("total_count") ? jsonObject.getInt("total_count") : null;
        this.incompleteResults = !jsonObject.isNull("incomplete_results") ? jsonObject.getBoolean("incomplete_results") : null;
        List<Project> itemsList = new ArrayList<>();
        if(!jsonObject.isNull("items")) {
            JSONArray itemsArr = jsonObject.getJSONArray("items");
            itemsArr.forEach(item -> {
                itemsList.add(new Project(new JSONObject(item.toString())));
            });

        }
        this.items = itemsList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Boolean getIncomplete_results() {
        return incompleteResults;
    }

    public void setIncomplete_results(Boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    public List<Project> getItems() {
        return items;
    }

    public void setItems(List<Project> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "totalCount=" + totalCount +
                ", incompleteResults=" + incompleteResults +
                ", items=" + items +
                '}';
    }
}
