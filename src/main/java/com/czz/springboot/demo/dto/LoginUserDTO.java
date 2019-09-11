package com.czz.springboot.demo.dto;

import lombok.Data;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 8:56
 * 登陆用户传输参数
 */
@Data
public class LoginUserDTO {
    /**
     * 用户名
     */
    private String account;

    /**
     * 用户密码
     */
    private String password;
}
