package com.czz.springboot.demo.dto;

import lombok.Data;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 8:57
 * 用户修改传输参数
 */
@Data
public class ModifyUserDTO {
    /**
     * 原密码
     */
    String oldPassword;

    /**
     * 新密码
     */
    String newPassword;
}
