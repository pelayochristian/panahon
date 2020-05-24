package com.project.panahon.newsservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {

    @Value("${api.news-api.uri}")
    private String newsAPIURL;

    @Value("${api.news-api.token}")
    private String newsAPIToken;

    @Value("${redis.expire.duration}")
    private int expireDuration;

    public String getNewsAPIURL() {
        return newsAPIURL;
    }

    public String getNewsAPIToken() {
        return newsAPIToken;
    }

    public int getExpireDuration() {
        return expireDuration;
    }
}
