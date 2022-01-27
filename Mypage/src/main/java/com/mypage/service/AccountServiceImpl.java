package com.mypage.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypage.dto.UserDto;
import com.mypage.mapper.AccountMapper;


@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public boolean registerUser(UserDto params){
		
		int a = 0;
		
		if(params.getId() != null) {
			a = accountMapper.Insertuser(params);			
		} 
		return (a == 1) ? true : false;		
	}	
}
