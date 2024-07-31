package com.example.tliaswebmanagement.service;

import com.example.tliaswebmanagement.pojo.Dept;

import java.util.List;

//部门业务规则
public interface DeptService
{
    List<Dept> list();

    /**
     * 根据id删除部门
     * @param id    部门id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param dept  部门对象
     */
    void add(Dept dept);



}
