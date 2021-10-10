package com.example.demo.registration;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String register(RegistrationRequest request) {
        // 작동한다고 한다는 가정
        return "works";
    }
}
