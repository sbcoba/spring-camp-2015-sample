package sample.profile.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class HelloService {
    private static final Logger log = LoggerFactory.getLogger(HelloService.class);
    @Value("${db.driver}")
    private String dbDriver;
    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.user}")
    private String dbUser;
    @Value("${db.password}")
    private String dbPassword;

    @Autowired
    private ServiceProperties prop;

    @PostConstruct
    public void printDbProperty() {
        log.info("dbDriver: {}", dbDriver);
        log.info("dbUrl: {}", dbUrl);
        log.info("dbUser: {}", dbUser);
        log.info("dbPassword: {}", dbPassword);

        log.info("name: {}", prop.getName());
        log.info("phone: {}", prop.getPhone());
        log.info("sex: {}", prop.getSex());

	}
}