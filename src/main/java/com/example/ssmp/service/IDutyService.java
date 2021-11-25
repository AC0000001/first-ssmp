package com.example.ssmp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.ssmp.pojo.Duty;


//IService<Duty> 基本服务接口实现: 只有基本业务(Service)接口  缺少实现
//BaseMapper<Duty> 实现数据库的基本操作方法类
//ServiceImpl<DutyDao, Duty> 全部IService实现： IService的
public interface IDutyService extends IService<Duty> {
//    boolean saveDuty(Duty duty);

    boolean modify(Duty duty);
    boolean delete(Integer id);
    IPage<Duty> getPage(int currentPage, int pageSize);

}
