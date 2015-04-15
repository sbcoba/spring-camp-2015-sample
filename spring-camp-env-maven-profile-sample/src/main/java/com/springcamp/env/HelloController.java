package com.springcamp.env;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @Value("${profiles.active}")
    private String profilesActive;

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
		model.addAttribute("profilesActive", profilesActive);
		model.addAttribute("dbDriver", dbDriver);
		model.addAttribute("dbUrl", dbUrl);
		model.addAttribute("dbUser", dbUser);
		model.addAttribute("dbPassword", dbPassword);

		return "hello";
	}
}