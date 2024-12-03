package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.entity.ActivityManager;
import com.example.demo.model.entity.ClassRoom;
import com.example.demo.model.entity.ClassType;
import com.example.demo.model.entity.Member;
import com.example.demo.repository.ActivityManagerRepository;
import com.example.demo.repository.ClassRoomRepository;
import com.example.demo.repository.ClassTypeRepository;
import com.example.demo.repository.MemberRepository;

@SpringBootTest
public class AddMemberServiceTest {

	@Autowired
	ActivityManagerRepository activityManagerRepository;
	
	@Test
	void add() {
		ActivityManager activityManager = new ActivityManager();
		activityManager.setName("Yang");
		activityManager.setUsername("YangYang");
		activityManager.setPassword("1234");
		activityManagerRepository.save(activityManager);
	}
	
}