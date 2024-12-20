package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.MemberBookingForm;

@Repository		// 會員預約表
public interface MemberBookingFormRepository extends JpaRepository<MemberBookingForm, Long> {

}
