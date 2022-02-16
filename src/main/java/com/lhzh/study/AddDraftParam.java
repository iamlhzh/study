package com.lhzh.study;

import java.io.Serializable;
import java.util.List;

public class AddDraftParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private String appid;

    private List<Article> articles;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
