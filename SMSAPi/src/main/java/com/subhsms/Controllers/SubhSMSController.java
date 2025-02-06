package com.subhsms.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.util.*;
@CrossOrigin
@RestController
@RequestMapping("/api/otp")
public class SubhSMSController {

    private Map<String, String> otpStorage = new HashMap<>();
	public String  test()
	{
		return "Testing...";
	}
    // Method to generate a random 6-digit OTP
    private String generateOtp(int length) {
        StringBuilder otp = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            otp.append(random.nextInt(10)); // Append a random digit (0-9)
        }
        return otp.toString();
    }
    @GetMapping("/send/{contactnumber}")
    public Map<String,Object> sendOtpViaUnirest(@PathVariable String contactnumber) 
    {
    	HashMap<String,Object> responsemap=new HashMap<String,Object>();
        try {            
            String otp = generateOtp(4);
            String message = String.format("OTP for login: {%s}",otp);
            HttpResponse<String> response = Unirest.get("https://automate.nexgplatforms.com/api/v1/sms"
                    + "?contactnumber=" + contactnumber
                    + "&header=SUBHFN"
                    + "&message=" + message.replace(" ", "%20").replace("{", "%7B").replace("}", "%7D")
                    + "&messageType=normal"
                    + "&messageid=3fbdd0b1-030f-4359-b21c-4334y4ffe"
                    + "&serviceType=transactional"
                    + "&entityid=1201159195854796804"
                    + "&templateid=1207161596312561180")
                    .header("Authorization", "09de330ad643416380ecadbbff117ebe")
                    .asString();
            if(response.isSuccess()) {
            	responsemap.put("status","success");
            	System.out.println("OTP:"+otp);
            	responsemap.put("OTP", otp);
            }
            return responsemap;
        } catch (Exception e) {
        	responsemap.put("code", "500");
        	responsemap.put("status", "error");
        	responsemap.put("message", "Failed to send OTP.");
        	return responsemap;
        }
    }
//    @GetMapping("/verify/{contactnumber}/{otp}")
//    public Map<String, String> verifyOtp(@PathVariable String contactnumber, @PathVariable String otp) {
//        Map<String, String> result = new HashMap<>();
//        if (otp.equals(result))) {
//            otpStorage.remove(contactnumber); // OTP verified, remove it
//            result.put("status", "success");
//            result.put("message", "OTP verification successful!");
//        } else {
//            result.put("status", "failed");
//            result.put("message", "Invalid OTP, please try again.");
//        }
//        return result;
//    }
}

