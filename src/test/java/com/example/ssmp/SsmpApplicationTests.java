package com.example.ssmp;

import com.example.ssmp.dao.DutyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.ssmp.pojo.Duty;

import java.util.Date;

@SpringBootTest
class SsmpApplicationTests {



	@Autowired
	private DutyDao dutyDao;

	@Test
	void testGetall() {
		System.out.println(dutyDao.selectById(1));
	}

	@Test
	void testSave() {

		Duty duty = new Duty();
		duty.setName("1");
		duty.setDuration(4);
		Date date = new Date(2010,1,1);
		duty.setDate(date);
		dutyDao.insert(duty);
	}


	@Test
	void testadd() {
		System.out.println(dutyDao.selectById(1));
	}
}
