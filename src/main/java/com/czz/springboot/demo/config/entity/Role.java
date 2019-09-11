package com.czz.springboot.demo.config.entity;

import com.czz.springboot.demo.domain.Base;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 9:11
 */
@Getter
@Setter
@Entity
@Table(name = "um_t_role")
public class Role extends Base {
    private static final long serialVersionUID = 5711236670493167247L;
    /**
     * 角色名
     */
    private String name;

    /**
     * 角色
     */
    private String role;

    /**
     * 角色 -- 用户: 1对多
     */
    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "um_t_role_user", joinColumns = {@JoinColumn(name = "roleId")}, inverseJoinColumns = {@JoinColumn(name = "userId")})
    private Set<User> users;
}
