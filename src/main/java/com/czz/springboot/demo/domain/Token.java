package com.czz.springboot.demo.domain;

import com.czz.springboot.demo.domain.bean.RefreshTokenBean;

import java.util.List;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 9:06
 */
public class Token {
    /**
     * 过期时间
     */
    private String expiration;
    /**
     * 是否过期
     */
    private boolean expired;
    /**
     * refreshToken对象
     */
    private RefreshTokenBean refreshToken;
    /**
     * 过期时限
     */
    private int expiresIn;

    /**
     * token类型
     */
    private String tokenType;

    /**
     * access_token值
     */
    private String value;

    /**
     * 使用范围
     */
    private List<String> scope;


    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public RefreshTokenBean getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(RefreshTokenBean refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }
}
