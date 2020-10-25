package com.filipmoszczynski.module.config;

import com.filipmoszczynski.core.ApplicationConfig;
import com.filipmoszczynski.core.ApplicationConfigDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigRestController {

    @Autowired
    public ConfigRestController(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    private ApplicationConfig applicationConfig;

    @GetMapping("/api/config")
    public ApplicationConfigDto getConfig() {
        return applicationConfig.asDto();
    }
}
