package com.example.tliaswebmanagement.controller;

import com.example.tliaswebmanagement.pojo.Dept;
import com.example.tliaswebmanagement.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.tliaswebmanagement.pojo.Result;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController
{
    @Autowired
    private DeptService deptService;

    @GetMapping
    public Result list()
    {
        log.info("查询所有部门数据");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    //删除部门
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id)
    {
        log.info("根据id删除部门");
        deptService.delete(id);
        return Result.success();
    }

    //新增部门
    @PostMapping
    public Result add(@RequestBody Dept dept)
    {
        log.info("新增部门:{}",dept);
        deptService.add(dept);
        return Result.success();
    }
}
