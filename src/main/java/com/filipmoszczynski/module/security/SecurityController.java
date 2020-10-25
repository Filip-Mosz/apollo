package com.filipmoszczynski.module.security;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class SecurityController {

    @PostMapping("/api/security")
    public RequestForm newForm(
        @Valid
        @RequestBody
        RequestForm requestForm){
        return requestForm;
    }


}
