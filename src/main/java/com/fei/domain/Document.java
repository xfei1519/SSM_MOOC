package com.fei.domain;

import java.util.Date;

public class Document {
    private Integer id;
    private String name;
    private Classify kind;
    private UserInfo uploadUser;
    private String key;
    private String url;
    private String summary;
    private Date uploadDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classify getKind() {
        return kind;
    }

    public void setKind(Classify kind) {
        this.kind = kind;
    }

    public UserInfo getUploadUser() {
        return uploadUser;
    }

    public void setUploadUser(UserInfo uploadUser) {
        this.uploadUser = uploadUser;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", uploadUser='" + uploadUser + '\'' +
                ", key='" + key + '\'' +
                ", url='" + url + '\'' +
                ", summary='" + summary + '\'' +
                ", uploadDate=" + uploadDate +
                '}';
    }
}
