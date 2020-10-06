package org.pmt.model;

import org.json.JSONObject;

public class Tree {

    private String sha;
    private String url;

    public Tree() { }

    public Tree(JSONObject jsonObject) {
        this.sha = !jsonObject.isNull("sha") ? jsonObject.getString("sha") : null;
        this.url = !jsonObject.isNull("url") ? jsonObject.getString("url") : null;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "sha='" + sha + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
