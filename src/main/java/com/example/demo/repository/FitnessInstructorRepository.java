package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.FitnessInstructor;

@Repository		// 教練
public interface FitnessInstructorRepository extends JpaRepository<FitnessInstructor, Long> {

	List<FitnessInstructor> findByClassType(Long classTypeId);

}
