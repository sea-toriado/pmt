package org.pmt.model;

import org.json.JSONObject;

public class Creator {
    private String login;
    private String nodeId;
    private String avatarUrl;
    private String gravatarId;
    private String url;
    private String htmlUrl;
    private String followersUrl;
    private String followingUrl;
    private String gistsUrl;
    private String starredUrl;
    private String subscriptionsUrl;
    private String organizationsUrl;
    private String reposUrl;
    private String eventsUrl;
    private String receivedEventsUrl;
    private String type;
    private Boolean siteAdmin;

    public Creator() { }

    public Creator(JSONObject jsonObject) {
        this.login = !jsonObject.isNull("login") ? jsonObject.getString("login") : null;
        this.nodeId = !jsonObject.isNull("node_id") ? jsonObject.getString("node_id") : null;
        this.avatarUrl = !jsonObject.isNull("avatar_url") ? jsonObject.getString("avatar_url") : null;
        this.gravatarId = !jsonObject.isNull("gravatar_id") ? jsonObject.getString("gravatar_id") : null;
        this.url = !jsonObject.isNull("url") ? jsonObject.getString("url") : null;
        this.htmlUrl = !jsonObject.isNull("html_url") ? jsonObject.getString("html_url") : null;
        this.followersUrl = !jsonObject.isNull("followers_url") ? jsonObject.getString("followers_url") : null;
        this.followingUrl = !jsonObject.isNull("following_url") ? jsonObject.getString("following_url") : null;
        this.gistsUrl = !jsonObject.isNull("gists_url") ? jsonObject.getString("gists_url") : null;
        this.starredUrl = !jsonObject.isNull("starred_url") ? jsonObject.getString("starred_url") : null;
        this.subscriptionsUrl = !jsonObject.isNull("subscriptions_url") ? jsonObject.getString("subscriptions_url") : null;
        this.organizationsUrl = !jsonObject.isNull("organizations_url") ? jsonObject.getString("organizations_url") : null;
        this.reposUrl = !jsonObject.isNull("repos_url") ? jsonObject.getString("repos_url") : null;
        this.eventsUrl = !jsonObject.isNull("events_url") ? jsonObject.getString("events_url") : null;
        this.receivedEventsUrl = !jsonObject.isNull("received_events_url") ? jsonObject.getString("received_events_url") : null;
        this.type = !jsonObject.isNull("type") ? jsonObject.getString("type") : null;
        this.siteAdmin = !jsonObject.isNull("site_admin") ? jsonObject.getBoolean("site_admin") : null;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    @Override
    public String toString() {
        return "Creator{" +
                "login='" + login + '\'' +
                ", nodeId='" + nodeId + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", gravatarId='" + gravatarId + '\'' +
                ", url='" + url + '\'' +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", followersUrl='" + followersUrl + '\'' +
                ", followingUrl='" + followingUrl + '\'' +
                ", gistsUrl='" + gistsUrl + '\'' +
                ", starredUrl='" + starredUrl + '\'' +
                ", subscriptionsUrl='" + subscriptionsUrl + '\'' +
                ", organizationsUrl='" + organizationsUrl + '\'' +
                ", reposUrl='" + reposUrl + '\'' +
                ", eventsUrl='" + eventsUrl + '\'' +
                ", receivedEventsUrl='" + receivedEventsUrl + '\'' +
                ", type='" + type + '\'' +
                ", siteAdmin=" + siteAdmin +
                '}';
    }
}
