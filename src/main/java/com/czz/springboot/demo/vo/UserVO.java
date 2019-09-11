package com.czz.springboot.demo.vo;

import com.czz.springboot.demo.domain.Base;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 9:13
 */
@Setter
@Getter
@ToString
public class UserVO extends Base {
    private static final long serialVersionUID = 869542224576258376L;
    /**
     * 用户账号
     */
    private String account;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户角色
     */
    private RoleVO role;
}
