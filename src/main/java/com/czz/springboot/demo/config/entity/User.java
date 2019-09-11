package com.czz.springboot.demo.config.entity;

import com.czz.springboot.demo.domain.Base;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 9:12
 */
@Getter
@Setter
@Entity
@Table(name = "um_t_user")
public class User extends Base {

    private static final long serialVersionUID = 8340163255782579758L;
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
     * 用户 --角色 多对一
     */
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "um_t_role_user", joinColumns = {@JoinColumn(name = "userId")}, inverseJoinColumns = {@JoinColumn(name = "roleId")})
    private Role role;

}
