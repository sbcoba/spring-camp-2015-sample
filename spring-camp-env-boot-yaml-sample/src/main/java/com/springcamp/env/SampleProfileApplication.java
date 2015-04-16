package com.springcamp.env;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SampleProfileApplication {

	public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleProfileApplication.class, customizeArgs(args));
	}

    private static String[] customizeArgs(String[] args) {
        List<String> argList = new ArrayList<String>(Arrays.asList(args));
	    argList.add("--spring.config.location=classpath:db-config.yml");
		String[] mergeArgs = argList.toArray(new String[]{});
        return mergeArgs;
    }
}
