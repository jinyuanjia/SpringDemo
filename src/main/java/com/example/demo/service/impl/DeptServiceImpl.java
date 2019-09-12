package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DeptDao;
import com.example.demo.model.Dept;
import com.example.demo.service.DeptService;

/**
 * Created by ZeroV on 2018/11/6.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }

}
