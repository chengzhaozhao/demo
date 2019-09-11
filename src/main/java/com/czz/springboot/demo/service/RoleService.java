package com.czz.springboot.demo.service;

import com.czz.springboot.demo.config.entity.Role;
import com.czz.springboot.demo.vo.ResponseVO;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 8:56
 */
public interface RoleService {
    /**
     * @description 获取角色列表
     * @return
     */
    ResponseVO findAllRoleVO();

    /**
     * @description 根据角色id获取角色
     */
    Role findById(Integer id);
}
