package com.filipmoszczynski.module.config;

import com.filipmoszczynski.core.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfigController {

    @Autowired
    public ConfigController(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    private ApplicationConfig applicationConfig;

    @GetMapping("/config")
    public String getConfig(Model model) {
        model.addAttribute("config", applicationConfig.asDto());
        return "config.html";
    }

}
