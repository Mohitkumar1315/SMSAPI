package com.subhsms.services;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OtpService {

    private static final String OTP_API_URL = "https://automate.nexgplatforms.com/api/v1/sms";

    private final RestTemplate restTemplate;

    public OtpService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String sendOtp(String contactNumber, String message) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "09de330ad643416380ecadbbff117ebe");
        
        // Escape curly braces in the message
        String formattedMessage = message.replace("{", "%7B").replace("}", "%7D");

        // URL with query parameters
        String url = String.format(
            "%s?contactnumber=%s&header=SUBHFN&message=%s&messageType=normal&messageid=3fbdd0b1-030f-4359-b21c-4334y4ffe&serviceType=transactional&entityid=1201159195854796804&templateid=1207161596312561180",
            OTP_API_URL, contactNumber, formattedMessage);

        HttpEntity<String> requestEntity = new HttpEntity<>(headers);

        try {
            // Make the API request (GET method)
            ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);

            // Log the status and response body
            System.out.println("Response Status: " + responseEntity.getStatusCode());
            System.out.println("Response Body: " + responseEntity.getBody());

            return responseEntity.getBody();
        } catch (Exception e) {
            // Log and rethrow the exception for debugging purposes
            System.err.println("Error occurred: " + e.getMessage());
            throw e;
        }
    }

}
