package com.springcamp.env;

import java.util.Collections;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.core.env.MapPropertySource;
import org.springframework.util.StringUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Application 환경변수를 초기화하는 클래스
 *
 */
public class EnvironmentInitializer implements ApplicationContextInitializer<XmlWebApplicationContext> {
    private static final String SPRING_PROFILES_ACTIVE = "spring.profiles.active";

    @Override
    public void initialize(XmlWebApplicationContext ac) {

        String activeProfile = ac.getServletContext().getInitParameter(SPRING_PROFILES_ACTIVE);

        if (!StringUtils.hasText(activeProfile)) {
            activeProfile = System.getProperty(SPRING_PROFILES_ACTIVE);
        }

        if (!StringUtils.hasText(activeProfile)) {
            activeProfile = System.getProperty(SPRING_PROFILES_ACTIVE);
        }

        if (!StringUtils.hasText(activeProfile)) {
            return;
        }

        ac.getEnvironment().getPropertySources()
                .addLast(new MapPropertySource(
                        "profiles",
                        Collections.<String, Object>singletonMap("profiles.active", activeProfile)));
    }
}