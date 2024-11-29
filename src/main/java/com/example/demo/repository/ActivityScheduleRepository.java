package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.ActivitySchedule;

@Repository		// 活動
public interface ActivityScheduleRepository extends JpaRepository<ActivitySchedule, Long> {

	Optional<ActivitySchedule> findByClassRoom(String classRoom);
	
	Optional<ActivitySchedule> findByFitnessInstructor(Long id);
	
	Optional<ActivitySchedule> findByClassType(Long id);
}
