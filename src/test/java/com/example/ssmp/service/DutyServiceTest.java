package com.example.ssmp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.ssmp.pojo.Duty;

import java.util.Date;

@SpringBootTest
public class DutyServiceTest {

    @Autowired
    private IDutyService iDutyService;

    @Test
    void testSave() {
        Duty duty = new Duty();
        duty.setName("1");
        duty.setDuration(4);
        Date date = new Date(2010,1,1);
        duty.setDate(date);
        iDutyService.save(duty);
    }

    @Test
    void testGetAll(){
        iDutyService.list();
    }

}
