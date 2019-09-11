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
public class RoleVO extends Base {

    /**
     * 角色名(中文)
     */
    private String name;

    /**
     * 角色名
     */
    private String role;
}
