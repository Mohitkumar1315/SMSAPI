package com.subhsms.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
@RestController
@RequestMapping("/api/otp")
public class SubhSMSController 
{
	@GetMapping("/send/{contactnumber}")
    public String sendOtpViaUnirest(@PathVariable String contactnumber) {
        try {
            // Set timeouts and make the Unirest request
           // Unirest.setTimeouts(0, 0);
            HttpResponse<String> response = Unirest.get("https://automate.nexgplatforms.com/api/v1/sms"
                    + "?contactnumber=" + contactnumber
                    + "&header=SUBHFN"
                    + "&message=OTP%20for%20login%3A%7B1253%7D"
                    + "&messageType=normal"
                    + "&messageid=3fbdd0b1-030f-4359-b21c-4334y4ffe"
                    + "&serviceType=transactional"
                    + "&entityid=1201159195854796804"
                    + "&templateid=1207161596312561180")
                    .header("Authorization", "09de330ad643416380ecadbbff117ebe")
                    .asString();

            // Return the response body
            return response.getBody();
        } catch (Exception e) {
            // Handle any exceptions and return an error message
            return "Error occurred: " + e.getMessage();
        }
    }
}
