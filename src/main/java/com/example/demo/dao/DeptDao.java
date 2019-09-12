package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Dept;

/**
 * Created by ZeroV on 2018/11/6.
 */
@Mapper
public interface DeptDao {

    public List<Dept> findAll();
}
