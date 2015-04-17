package com.springcamp.env;

import javax.annotation.PostConstruct;

import com.springcamp.env.service.DatabaseProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PrintProperty {
    private static final Logger log = LoggerFactory.getLogger(PrintProperty.class);
    @Value("${db.driver}")
    private String dbDriver;
    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.user}")
    private String dbUser;
    @Value("${db.password}")
    private String dbPassword;

    @Value("${service.name}")
    private String name;
    @Value("${service.sex}")
    private String sex;
    @Value("${service.phone}")
    private String phone;

    @Autowired
    private DatabaseProperties prop;

    @PostConstruct
    public void printProperty() {
        log.info("dbDriver: {}", dbDriver);
        log.info("dbUrl: {}", dbUrl);
        log.info("dbUser: {}", dbUser);
        log.info("dbPassword: {}", dbPassword);

        log.info("name: {}", name);
        log.info("sex: {}", sex);
        log.info("phone: {}", phone);

	}
}