package com.subhsms.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import java.util.Random;
@RestController
@RequestMapping("/api/otp")
public class SubhSMSController {
 
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
    public String sendOtpViaUnirest(@PathVariable String contactnumber) {
        try {            
            String otp = generateOtp(6);
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
            return response.getBody();
        } catch (Exception e) {
            // Handle any exceptions and return an error message
            return "Error occurred: " + e.getMessage();
        }
    }
}
