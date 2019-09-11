package com.czz.springboot.demo.dto;

import com.czz.springboot.demo.domain.Base;
import lombok.Data;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 8:58
 * 添加 修改用户传输参数
 */
@Data
public class UserDTO extends Base {
    private static final long serialVersionUID = 201931068611621753L;
    /**
     * 用户名
     */
    private String account;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户角色id
     */
    private Integer roleId;
}
