package com.czz.springboot.demo.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 9:03
 */
@Data
public class CustomUserDetail implements Serializable,UserDetails {
    private static final long serialVersionUID = -7844574953304581646L;

    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 账户生效
     */
    private boolean accountNonExpired = true;
    /**
     * 账户锁定
     */
    private boolean accountNonLocked = true;
    /**
     * 凭证生效
     */
    private boolean credentialsNonExpired = true;
    /**
     * 激活状态
     */
    private boolean enabled = true;
    /**
     * 权限列表
     */
    private Collection<GrantedAuthority> authorities;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }


    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
