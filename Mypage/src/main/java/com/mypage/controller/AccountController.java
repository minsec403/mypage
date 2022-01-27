package com.mypage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mypage.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping(value = "/account/join")
	public String Accountuser(Model model) {
		return "account/join";
	}
}
