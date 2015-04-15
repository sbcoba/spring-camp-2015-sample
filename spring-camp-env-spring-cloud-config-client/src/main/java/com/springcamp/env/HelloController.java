package com.springcamp.env;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RefreshScope
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private Environment environment;

    @Value("${db.driver}")
    private String dbDriver;
    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.user}")
    private String dbUser;
    @Value("${db.password}")
    private String dbPassword;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		model.addAttribute("profilesActives", Arrays.toString(environment.getActiveProfiles()));
		model.addAttribute("dbDriver", dbDriver);
		model.addAttribute("dbUrl", dbUrl);
		model.addAttribute("dbUser", dbUser);
		model.addAttribute("dbPassword", dbPassword);

		return "hello";
	}
}