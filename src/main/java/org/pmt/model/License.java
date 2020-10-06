package org.pmt.model;

import org.json.JSONObject;

public class License {

    private String key;
    private String name;
    private String spdxId;
    private String url;
    private String nodeId;

    public License() { }

    public License(JSONObject jsonObject) {
        this.key = !jsonObject.isNull("key") ? jsonObject.getString("key") : null;
        this.name = !jsonObject.isNull("name") ? jsonObject.getString("name") : null;
        this.spdxId = !jsonObject.isNull("spdx_id") ? jsonObject.getString("spdx_id") : null;
        this.url = !jsonObject.isNull("url") ? jsonObject.getString("url") : null;
        this.nodeId = !jsonObject.isNull("node_id") ? jsonObject.getString("node_id") : null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpdxId() {
        return spdxId;
    }

    public void setSpdxId(String spdxId) {
        this.spdxId = spdxId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public String toString() {
        return "License{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", spdxId='" + spdxId + '\'' +
                ", url='" + url + '\'' +
                ", nodeId='" + nodeId + '\'' +
                '}';
    }
}
