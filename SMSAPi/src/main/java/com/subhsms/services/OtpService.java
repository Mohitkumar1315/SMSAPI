package com.subhsms.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OtpService {

    private static final String OTP_API_URL = "https://automate.nexgplatforms.com/api/v1/sms/save";

    @Autowired
    private RestTemplate restTemplate;

    public String sendOtp(String contactNumber, String message) {
        HttpHeaders headers =  new HttpHeaders();
        headers.set("Authorization", "09de330ad643416380ecadbbff117ebe");
        headers.set("Content-Type", "application/json");

        // Create request body
        String requestBody = String.format("{\"header\":\"SUBHFN\",\"contactnumber\":\"%s\",\"message\":\"%s\",\"messageType\":\"normal\",\"messageid\":\"3fbdd0b1-030f-4359-b21c-4334y4ffe\",\"serviceType\":\"transactional\",\"entityid\":\"1201159195854796804\",\"templateid\":\"1207161596312561180\"}", 
                                            contactNumber, message);

        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(OTP_API_URL, HttpMethod.POST, requestEntity, String.class);

        return responseEntity.getBody();
    }
}
