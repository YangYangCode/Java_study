package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.dto.MemberDTO;

public interface MemberService {
	// 查詢單一會員Booking
	// 在BookingForm
	
	// 新增會員
	Optional<MemberDTO> addMember(MemberDTO memberDTO);
	
	// 修改會員
	Optional<MemberDTO> Member(MemberDTO memberDTO, Long id);
	
	// 刪除會員
	Optional<MemberDTO> deleteMember(Long id);
	
}


