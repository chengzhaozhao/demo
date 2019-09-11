package com.czz.springboot.demo.service.impl;

import com.czz.springboot.demo.config.entity.Role;
import com.czz.springboot.demo.repository.RoleRepository;
import com.czz.springboot.demo.service.RoleService;
import com.czz.springboot.demo.vo.ResponseVO;
import com.czz.springboot.demo.vo.RoleVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public ResponseVO findAllRoleVO() {
        List<Role> rolePOList = roleRepository.findAll();
        List<RoleVO> roleVOList = new ArrayList<>();
        rolePOList.forEach(rolePO->{
            RoleVO roleVO = new RoleVO();
            BeanUtils.copyProperties(rolePO,roleVO);
            roleVOList.add(roleVO);
        });
        return ResponseVO.success(roleVOList);
    }

    @Override
    public Role findById(Integer id) {
        return roleRepository.findById(id).get();
    }
}
