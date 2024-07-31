package com.example.tliaswebmanagement.service;

import com.example.tliaswebmanagement.mapper.DeptMapper;
import com.example.tliaswebmanagement.pojo.Dept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

//部门业务实现类
@Slf4j
@Service
public class DeptServiceImpl implements DeptService
{
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list()
    {
        List<Dept> deptList = deptMapper.list();
        return deptList;
    }

    @Override
    public void delete(Integer id)
    {
        deptMapper.deleteById(id);
    }

    @Override
    public void add(Dept dept)
    {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insert(dept);
    }
}
