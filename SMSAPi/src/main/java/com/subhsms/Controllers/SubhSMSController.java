package com.subhsms.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subhsms.services.OtpService;

@RestController
@RequestMapping("/api/otp")
public class SubhSMSController 
{
	@Autowired 
	OtpService otpservice;
	
	@GetMapping("/test")
	public String test()
	{
		return "method testing in SubhSMSController";
	}
	
	@PostMapping("/send/{contactnumber}")
	public String sendOtp(@PathVariable String contactnumber) {
	    System.out.println("You are in sendOTP method");
	    String msg = "OTP for test login {1235}";
	    return otpservice.sendOtp(contactnumber, msg);
	}
}
