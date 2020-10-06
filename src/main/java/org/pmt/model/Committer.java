package org.pmt.model;

import org.json.JSONObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Committer {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

    private String name;
    private String email;
    private LocalDateTime date;
    private Integer commitCount;
    private Double commitImpact;

    public Committer() {}

    public Committer(JSONObject jsonObject) {
        this.name = !jsonObject.isNull("name") ? jsonObject.getString("name") : null;
        this.email = !jsonObject.isNull("email") ? jsonObject.getString("email") : null;
        this.date = !jsonObject.isNull("date") ? LocalDateTime.parse(jsonObject.getString("date"), formatter) : null;
        this.commitCount = 0;
        this.commitImpact= 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
    }

    public Double getCommitImpact() {
        return commitImpact;
    }

    public void setCommitImpact(Double commitImpact) {
        this.commitImpact = commitImpact;
    }

    @Override
    public String toString() {
        return "Committer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", commitCount=" + commitCount +
                ", commitImpact=" + commitImpact +
                '}';
    }
}