package com.czz.springboot.demo.repository;


import com.czz.springboot.demo.config.entity.User;
import com.czz.springboot.demo.repository.base.BaseRepository;

public interface UserRepository extends BaseRepository<User> {

    User findUserByAccount(String account);
}
