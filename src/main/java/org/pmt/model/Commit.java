package org.pmt.model;

import org.json.JSONObject;

public class Commit {

    private Committer author;
    private Committer committer;
    private String message;
    private Tree tree;
    private String url;
    private Integer commentCount;

    public Commit() { }

    public Commit(JSONObject jsonObject) {
        this.message = !jsonObject.isNull("message") ? jsonObject.getString("message") : null;
        this.url = !jsonObject.isNull("url") ? jsonObject.getString("url") : null;
        this.author = !jsonObject.isNull("author") ? new Committer(jsonObject.getJSONObject("author")) : null;
        this.committer = !jsonObject.isNull("committer") ? new Committer(jsonObject.getJSONObject("committer")) : null;
        this.tree = !jsonObject.isNull("tree") ? new Tree(jsonObject.getJSONObject("tree")) : null;
    }

    public Committer getAuthor() {
        return author;
    }

    public void setAuthor(Committer author) {
        this.author = author;
    }

    public Committer getCommitter() {
        return committer;
    }

    public void setCommitter(Committer committer) {
        this.committer = committer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "author=" + author +
                ", committer=" + committer +
                ", message='" + message + '\'' +
                ", tree=" + tree +
                ", url='" + url + '\'' +
                ", commentCount=" + commentCount +
                '}';
    }
}