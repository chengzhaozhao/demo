package com.czz.springboot.demo.enums;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 9:16
 */
public enum UrlEnum {
    //oauth2登录
    LOGIN_URL("/oauth/token");

    private String url;

    UrlEnum(String url) {
        this.url = url;

    }


    public String getUrl() {
        return url;
    }
}
