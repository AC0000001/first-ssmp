package com.example.ssmp.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
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
    public List<Duty> getAll(){
        return iDutyService.list();
    }

    @PostMapping
    public Boolean save(@RequestBody Duty duty){
        return iDutyService.save(duty);
    }

    @PutMapping
    public Boolean update(@RequestBody Duty duty){
        return iDutyService.modify(duty);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return iDutyService.delete(id);
    }

    @GetMapping("{id}")
    public Duty getById(@PathVariable Integer id){
        return iDutyService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Duty> getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return iDutyService.getPage(currentPage,pageSize);
    }







}
