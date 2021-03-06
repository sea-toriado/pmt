package org.pmt.model;

import org.json.JSONObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Project {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

    private Integer id;
    private String nodeId;
    private String name;
    private String fullName;
    private String htmlUrl;
    private String description;
    private Boolean fork;
    private String url;
    private String forksUrl;
    private String keysUrl;
    private String collaboratorsUrl;
    private String teamsUrl;
    private String hooksUrl;
    private String issueEventsUrl;
    private String eventsUrl;
    private String assigneesUrl;
    private String branchesUrl;
    private String tagsUrl;
    private String blobsUrl;
    private String gitTagsUrl;
    private String gitRefsUrl;
    private String treesUrl;
    private String statusesUrl;
    private String languagesUrl;
    private String stargazersUrl;
    private String contributorsUrl;
    private String subscribersUrl;
    private String subscriptionUrl;
    private String commitsUrl;
    private String gitCommitsUrl;
    private String commentsUrl;
    private String issueCommentUrl;
    private String contentsUrl;
    private String compareUrl;
    private String mergesUrl;
    private String archiveUrl;
    private String downloadsUrl;
    private String issuesUrl;
    private String pullsUrl;
    private String milestonesUrl;
    private String notificationsUrl;
    private String labelsUrl;
    private String releasesUrl;
    private String deploymentsUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime pushedAt;
    private String gitUrl;
    private String sshUrl;
    private String cloneUrl;
    private String svnUrl;
    private String homepage;
    private Integer size;
    private Integer stargazersCount;
    private Integer watchersCount;
    private String language;
    private Boolean hasIssues;
    private Boolean hasProjects;
    private Boolean hasDownloads;
    private Boolean hasWiki;
    private Boolean hasPages;
    private Integer forksCount;
    private String mirrorUrl;
    private Boolean archived;
    private Boolean disabled;
    private Integer openIssuesCount;
    private Integer forks;
    private Integer openIssues;
    private Integer watchers;
    private String defaultBranch;
    private Double score;
    private Creator creator;
    private License license;

    public Project() { }

    public Project(JSONObject jsonObject) {
        this.id = !jsonObject.isNull("id") ? jsonObject.getInt("id") : null;
        this.nodeId = !jsonObject.isNull("node_id") ? jsonObject.getString("node_id") : null;
        this.name = !jsonObject.isNull("name") ? jsonObject.getString("name") : null;
        this.fullName = !jsonObject.isNull("full_name") ? jsonObject.getString("full_name") : null;
        this.htmlUrl = !jsonObject.isNull("html_url") ? jsonObject.getString("html_url") : null;
        this.description = !jsonObject.isNull("description") ? jsonObject.getString("description") : null;
        this.fork = !jsonObject.isNull("fork") ? jsonObject.getBoolean("fork") : null;
        this.url = !jsonObject.isNull("url") ? jsonObject.getString("url") : null;
        this.forksUrl = !jsonObject.isNull("forks_url") ? jsonObject.getString("forks_url") : null;
        this.keysUrl = !jsonObject.isNull("keys_url") ? jsonObject.getString("keys_url") : null;
        this.collaboratorsUrl = !jsonObject.isNull("collaborators_url") ? jsonObject.getString("collaborators_url") : null;
        this.teamsUrl = !jsonObject.isNull("teams_url") ? jsonObject.getString("teams_url") : null;
        this.hooksUrl = !jsonObject.isNull("hooks_url") ? jsonObject.getString("hooks_url") : null;
        this.issueEventsUrl = !jsonObject.isNull("issue_events_url") ? jsonObject.getString("issue_events_url") : null;
        this.eventsUrl = !jsonObject.isNull("events_url") ? jsonObject.getString("events_url") : null;
        this.assigneesUrl = !jsonObject.isNull("assignees_url") ? jsonObject.getString("assignees_url") : null;
        this.branchesUrl = !jsonObject.isNull("branches_url") ? jsonObject.getString("branches_url") : null;
        this.tagsUrl = !jsonObject.isNull("tags_url") ? jsonObject.getString("tags_url") : null;
        this.blobsUrl = !jsonObject.isNull("blobs_url") ? jsonObject.getString("blobs_url") : null;
        this.gitTagsUrl = !jsonObject.isNull("git_tags_url") ? jsonObject.getString("git_tags_url") : null;
        this.gitRefsUrl = !jsonObject.isNull("git_refs_url") ? jsonObject.getString("git_refs_url") : null;
        this.treesUrl = !jsonObject.isNull("trees_url") ? jsonObject.getString("trees_url") : null;
        this.statusesUrl = !jsonObject.isNull("statuses_url") ? jsonObject.getString("statuses_url") : null;
        this.languagesUrl = !jsonObject.isNull("languages_url") ? jsonObject.getString("languages_url") : null;
        this.stargazersUrl = !jsonObject.isNull("stargazers_url") ? jsonObject.getString("stargazers_url") : null;
        this.contributorsUrl = !jsonObject.isNull("contributors_url") ? jsonObject.getString("contributors_url") : null;
        this.subscribersUrl = !jsonObject.isNull("subscribers_url") ? jsonObject.getString("subscribers_url") : null;
        this.subscriptionUrl = !jsonObject.isNull("subscription_url") ? jsonObject.getString("subscription_url") : null;
        this.commitsUrl = !jsonObject.isNull("commits_url") ? jsonObject.getString("commits_url") : null;
        this.gitCommitsUrl = !jsonObject.isNull("git_commits_url") ? jsonObject.getString("git_commits_url") : null;
        this.commentsUrl = !jsonObject.isNull("comments_url") ? jsonObject.getString("comments_url") : null;
        this.issueCommentUrl = !jsonObject.isNull("issue_comment_url") ? jsonObject.getString("issue_comment_url") : null;
        this.contentsUrl = !jsonObject.isNull("contents_url") ? jsonObject.getString("contents_url") : null;
        this.compareUrl = !jsonObject.isNull("compare_url") ? jsonObject.getString("compare_url") : null;
        this.mergesUrl = !jsonObject.isNull("merges_url") ? jsonObject.getString("merges_url") : null;
        this.archiveUrl = !jsonObject.isNull("archive_url") ? jsonObject.getString("archive_url") : null;
        this.downloadsUrl = !jsonObject.isNull("downloads_url") ? jsonObject.getString("downloads_url") : null;
        this.issuesUrl = !jsonObject.isNull("issues_url") ? jsonObject.getString("issues_url") : null;
        this.pullsUrl = !jsonObject.isNull("pulls_url") ? jsonObject.getString("pulls_url") : null;
        this.milestonesUrl = !jsonObject.isNull("milestones_url") ? jsonObject.getString("milestones_url") : null;
        this.notificationsUrl = !jsonObject.isNull("notifications_url") ? jsonObject.getString("notifications_url") : null;
        this.labelsUrl = !jsonObject.isNull("labels_url") ? jsonObject.getString("labels_url") : null;
        this.releasesUrl = !jsonObject.isNull("releases_url") ? jsonObject.getString("releases_url") : null;
        this.deploymentsUrl = !jsonObject.isNull("deployments_url") ? jsonObject.getString("deployments_url") : null;
        this.createdAt = !jsonObject.isNull("created_at") ? LocalDateTime.parse(jsonObject.getString("created_at"), formatter) : null;
        this.updatedAt = !jsonObject.isNull("updated_at") ? LocalDateTime.parse(jsonObject.getString("updated_at"), formatter) : null;
        this.pushedAt = !jsonObject.isNull("pushed_at") ? LocalDateTime.parse(jsonObject.getString("pushed_at"), formatter) : null;
        this.gitUrl = !jsonObject.isNull("git_url") ? jsonObject.getString("git_url") : null;
        this.sshUrl = !jsonObject.isNull("ssh_url") ? jsonObject.getString("ssh_url") : null;
        this.cloneUrl = !jsonObject.isNull("clone_url") ? jsonObject.getString("clone_url") : null;
        this.svnUrl = !jsonObject.isNull("svn_url") ? jsonObject.getString("svn_url") : null;
        this.homepage = !jsonObject.isNull("homepage") ? jsonObject.getString("homepage") : null;
        this.size = !jsonObject.isNull("size") ? jsonObject.getInt("size") : null;
        this.stargazersCount = !jsonObject.isNull("stargazers_count") ? jsonObject.getInt("stargazers_count") : null;
        this.watchersCount = !jsonObject.isNull("watchers_count") ? jsonObject.getInt("watchers_count") : null;
        this.language = !jsonObject.isNull("language") ? jsonObject.getString("language") : null;
        this.hasIssues = !jsonObject.isNull("has_issues") ? jsonObject.getBoolean("has_issues") : null;
        this.hasProjects = !jsonObject.isNull("has_projects") ? jsonObject.getBoolean("has_projects") : null;
        this.hasDownloads = !jsonObject.isNull("has_downloads") ? jsonObject.getBoolean("has_downloads") : null;
        this.hasWiki = !jsonObject.isNull("has_wiki") ? jsonObject.getBoolean("has_wiki") : null;
        this.hasPages = !jsonObject.isNull("has_pages") ? jsonObject.getBoolean("has_pages") : null;
        this.forksCount = !jsonObject.isNull("forks_count") ? jsonObject.getInt("forks_count") : null;
        this.mirrorUrl = !jsonObject.isNull("mirror_url") ? jsonObject.getString("mirror_url") : null;
        this.archived = !jsonObject.isNull("archived") ? jsonObject.getBoolean("archived") : null;
        this.disabled = !jsonObject.isNull("disabled") ? jsonObject.getBoolean("disabled") : null;
        this.openIssuesCount = !jsonObject.isNull("open_issues_count") ? jsonObject.getInt("open_issues_count") : null;
        this.forks = !jsonObject.isNull("forks") ? jsonObject.getInt("forks") : null;
        this.openIssues = !jsonObject.isNull("open_issues") ? jsonObject.getInt("open_issues") : null;
        this.watchers = !jsonObject.isNull("watchers") ? jsonObject.getInt("watchers") : null;
        this.defaultBranch = !jsonObject.isNull("default_branch") ? jsonObject.getString("default_branch") : null;
        this.score = !jsonObject.isNull("score") ? jsonObject.getDouble("score") : null;
        this.creator = !jsonObject.isNull("owner") ? new Creator(jsonObject.getJSONObject("owner")) : new Creator();
        this.license = !jsonObject.isNull("license") ? new License(jsonObject.getJSONObject("license")) : new License();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(LocalDateTime pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public Boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public Boolean getHasPages() {
        return hasPages;
    }

    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public String getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public Integer getForks() {
        return forks;
    }

    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Project{" +
                ", id=" + id +
                ", nodeId='" + nodeId + '\'' +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", description='" + description + '\'' +
                ", fork=" + fork +
                ", url='" + url + '\'' +
                ", forksUrl='" + forksUrl + '\'' +
                ", keysUrl='" + keysUrl + '\'' +
                ", collaboratorsUrl='" + collaboratorsUrl + '\'' +
                ", teamsUrl='" + teamsUrl + '\'' +
                ", hooksUrl='" + hooksUrl + '\'' +
                ", issueEventsUrl='" + issueEventsUrl + '\'' +
                ", eventsUrl='" + eventsUrl + '\'' +
                ", assigneesUrl='" + assigneesUrl + '\'' +
                ", branchesUrl='" + branchesUrl + '\'' +
                ", tagsUrl='" + tagsUrl + '\'' +
                ", blobsUrl='" + blobsUrl + '\'' +
                ", gitTagsUrl='" + gitTagsUrl + '\'' +
                ", gitRefsUrl='" + gitRefsUrl + '\'' +
                ", treesUrl='" + treesUrl + '\'' +
                ", statusesUrl='" + statusesUrl + '\'' +
                ", languagesUrl='" + languagesUrl + '\'' +
                ", stargazersUrl='" + stargazersUrl + '\'' +
                ", contributorsUrl='" + contributorsUrl + '\'' +
                ", subscribersUrl='" + subscribersUrl + '\'' +
                ", subscriptionUrl='" + subscriptionUrl + '\'' +
                ", commitsUrl='" + commitsUrl + '\'' +
                ", gitCommitsUrl='" + gitCommitsUrl + '\'' +
                ", commentsUrl='" + commentsUrl + '\'' +
                ", issueCommentUrl='" + issueCommentUrl + '\'' +
                ", contentsUrl='" + contentsUrl + '\'' +
                ", compareUrl='" + compareUrl + '\'' +
                ", mergesUrl='" + mergesUrl + '\'' +
                ", archiveUrl='" + archiveUrl + '\'' +
                ", downloadsUrl='" + downloadsUrl + '\'' +
                ", issuesUrl='" + issuesUrl + '\'' +
                ", pullsUrl='" + pullsUrl + '\'' +
                ", milestonesUrl='" + milestonesUrl + '\'' +
                ", notificationsUrl='" + notificationsUrl + '\'' +
                ", labelsUrl='" + labelsUrl + '\'' +
                ", releasesUrl='" + releasesUrl + '\'' +
                ", deploymentsUrl='" + deploymentsUrl + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", pushedAt=" + pushedAt +
                ", gitUrl='" + gitUrl + '\'' +
                ", sshUrl='" + sshUrl + '\'' +
                ", cloneUrl='" + cloneUrl + '\'' +
                ", svnUrl='" + svnUrl + '\'' +
                ", homepage='" + homepage + '\'' +
                ", size=" + size +
                ", stargazersCount=" + stargazersCount +
                ", watchersCount=" + watchersCount +
                ", language='" + language + '\'' +
                ", hasIssues=" + hasIssues +
                ", hasProjects=" + hasProjects +
                ", hasDownloads=" + hasDownloads +
                ", hasWiki=" + hasWiki +
                ", hasPages=" + hasPages +
                ", forksCount=" + forksCount +
                ", mirrorUrl=" + mirrorUrl +
                ", archived=" + archived +
                ", disabled=" + disabled +
                ", openIssuesCount=" + openIssuesCount +
                ", forks=" + forks +
                ", openIssues=" + openIssues +
                ", watchers=" + watchers +
                ", defaultBranch='" + defaultBranch + '\'' +
                ", score=" + score +
                ", creator=" + creator +
                ", license=" + license +
                '}';
    }
}
