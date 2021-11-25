package com.example.ssmp.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.ssmp.controller.utils.R;
import com.example.ssmp.service.IDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ssmp.pojo.Duty;

import java.util.List;

@RestController
@RequestMapping("/api/duty")
public class DutyController {

    @Autowired
    private IDutyService iDutyService;

    @GetMapping("/list")
    public R getAll(){
        R r = new R(true, iDutyService.list());
        return r;
    }

    @PostMapping
    public R save(@RequestBody Duty duty){
        R r = new R(iDutyService.save(duty));
        return r;
    }

    @PutMapping
    public R update(@RequestBody Duty duty){
        R r = new R(iDutyService.modify(duty));
        return r;
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
        R r = new R(iDutyService.delete(id));
        return r;
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        R r = new R(true, iDutyService.getById(id));
        return r;
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        R r = new R(true, iDutyService.getPage(currentPage, pageSize));
        return r;
    }







}
