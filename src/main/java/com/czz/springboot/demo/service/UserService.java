package com.czz.springboot.demo.service;

import com.czz.springboot.demo.dto.LoginUserDTO;
import com.czz.springboot.demo.dto.UserDTO;
import com.czz.springboot.demo.vo.ResponseVO;
import com.czz.springboot.demo.vo.UserVO;

import java.util.List;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 9:17
 */
public interface UserService {
    /**
     * @description 添加用户
     */
    void addUser(UserDTO userDTO) throws Exception;

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Integer id) throws Exception;

    /**
     * @description 修改用户信息
     * @param userDTO
     */
    void updateUser(UserDTO userDTO);

    /**
     * @description 获取所有用户列表VO
     * @return
     */
    ResponseVO<List<UserVO>> findAllUserVO();

    /**
     * @description 用户登录
     * @return
     */
    ResponseVO login(LoginUserDTO loginUserDTO);
}
