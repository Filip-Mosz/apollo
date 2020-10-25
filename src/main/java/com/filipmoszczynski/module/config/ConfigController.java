package com.filipmoszczynski.module.config;

import com.filipmoszczynski.core.ApplicationConfig;
import com.filipmoszczynski.module.config.location.ApplicationConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfigController {

    @Autowired
    public ConfigController(ApplicationConfig applicationConfig, ApplicationConfigService applicationConfigService) {
        this.applicationConfig = applicationConfig;
        this.applicationConfigService = applicationConfigService;
    }

    private final ApplicationConfig applicationConfig;
    private final ApplicationConfigService applicationConfigService;

    @GetMapping("/config")
    public String getConfig(Model model) {
        model.addAttribute("config", applicationConfig.asDto());
        model.addAttribute("location", applicationConfigService.getLocation());
        return "config.html";
    }

}
