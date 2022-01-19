package com.mypage.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.mypage.dto.UserDto;

@Mapper
public interface AccountMapper {

	public int Insertuser(UserDto params);  //회원가입
	
	public UserDto Loginuser(UserDto params); //로그인체크
}
