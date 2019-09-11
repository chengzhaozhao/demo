package com.czz.springboot.demo.domain.bean;

import lombok.Data;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 9:07
 */
@Data
public class RefreshTokenBean {
    /**
     * 过期时间
     */
    private String expiration;
    /**
     * token值
     */
    private String value;
}
