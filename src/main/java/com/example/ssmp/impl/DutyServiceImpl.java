package com.example.ssmp.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ssmp.dao.DutyDao;
import com.example.ssmp.service.IDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ssmp.pojo.Duty;

@Service
public class DutyServiceImpl extends ServiceImpl<DutyDao, Duty> implements IDutyService {

    @Autowired
    private DutyDao dutyDao;



    @Override
    public boolean modify(Duty duty) {
        return dutyDao.updateById(duty) > 0;
    }


    public boolean delete(Integer id) {
        return dutyDao.deleteById(id) > 0;
    }

    @Override
    public IPage<Duty> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);

        dutyDao.selectPage(page, null);

        return page;
    }

//    @Override
//    public boolean saveDuty(Duty duty) {
//        return dutyDao.insert(duty) > 0;
//    }

}
