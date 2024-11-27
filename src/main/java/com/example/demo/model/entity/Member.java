package com.example.demo.model.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	// 自動生成，從1開始，每次+1，過號不補
	private Long id;	// *會員邊號
	
	@Column(nullable = false)
	private String name;	// 會員名稱
	
	@ManyToMany(mappedBy = "signedMemberList")
	private Set<ActivitySchedule> activitySchedules = new HashSet<>(); // 參加的活動
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private MemberBookingForm memberBookingForm;
}
