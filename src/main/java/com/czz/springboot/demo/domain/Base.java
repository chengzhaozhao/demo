package com.czz.springboot.demo.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-11 8:59
 */
@Data
@MappedSuperclass
public class Base implements Serializable {

    private static final long serialVersionUID = 2696680618916110618L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    /**
     * 添加时间
     */
    protected Long createdTime;


    /**
     * 描述
     */
    protected String description;
}
