package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.entity.ClassRoom;
import com.example.demo.model.entity.ClassType;
import com.example.demo.repository.ClassRoomRepository;
import com.example.demo.repository.ClassTypeRepository;

@SpringBootTest
public class AddClassRoomServiceTest {

	@Autowired
	ClassTypeRepository classTypeRepository;
	
	@Test
	void add() {
		ClassType classType_1 = new ClassType();
		classType_1.setName("瑜珈");
		classTypeRepository.save(classType_1);
	}
	
}