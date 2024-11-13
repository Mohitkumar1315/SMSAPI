package com.subh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/testpages")
public class TestPagesController 
{

	@GetMapping("/")
	public String getSendOtp()
	{
		return "/pages/TestPages/OtpSend";
	}
}
