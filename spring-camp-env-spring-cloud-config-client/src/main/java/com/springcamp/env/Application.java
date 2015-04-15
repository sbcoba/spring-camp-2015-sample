
package com.springcamp.env;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.CompositePropertySource;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.PropertySource;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		CompositePropertySource compositePropertySource = (CompositePropertySource) run.getEnvironment().getPropertySources().get("bootstrap");
		for (PropertySource<?> propertySource : compositePropertySource.getPropertySources()) {
		    System.out.println("propertySource name: " + propertySource.getName());
		    for (String name : ((EnumerablePropertySource<?>)propertySource).getPropertyNames()) {
		        System.out.println(String.format("%s=%s", name, propertySource.getProperty(name)));
		    }
        }
	}
}