# 실전! 스프링과 함께하는 환경변수 관리 변천사 샘플

## 샘플의 사전조건
- JDK 1.7 이상 설치
- git 클라이언트 설치
- Maven 설치

## 소스 내려받기
```sh
$ git clone https://github.com/sbcoba/spring-camp-2015-sample.git
```
```sh
$ cd spring-camp-2015-sample
```

## Spring 3.0 with Maven Profile 샘플

1. 위치
	- /spring-camp-env-maven-profile-sample
2. 방법
```sh
$ cd spring-camp-env-maven-profile-sample
$ mvn tomcat7:run
```
3. 프로파일 별 실행방법
```sh
$ mvn -Plocal tomcat7:run
$ mvn -Ptest1 tomcat7:run
$ mvn -Pstaging tomcat7:run
$ mvn -Pprod1 tomcat7:run
$ mvn -Pprod2 tomcat7:run
```
3. 로컬 테스트
[http://localhost:8080](http://localhost:8080)

## Spring 3.1 Profile 샘플
1. 위치
	- /spring-camp-env-spring31-sample
2. 방법
```sh
$ cd spring-camp-env-spring31-sample
$ mvn tomcat7:run
```
3. 프로파일 별 실행방법
```sh
$ mvn tomcat7:run -Dspring.profiles.active=local
$ mvn tomcat7:run -Dspring.profiles.active=test1
$ mvn tomcat7:run -Dspring.profiles.active=staging
$ mvn tomcat7:run -Dspring.profiles.active=prod1
$ mvn tomcat7:run -Dspring.profiles.active=prod2
```

4. 로컬 테스트
[http://localhost:8080](http://localhost:8080)

## Spring Boot with yaml 샘플
1. 위치
	- /spring-camp-env-boot-yaml-sample
2. 방법
```sh
$ cd spring-camp-env-boot-yaml-sample
$ mvn spring-boot:run
```
3. 프로파일 별 실행방법
```sh
$ mvn spring-boot:run -Dspring.profiles.active=local
$ mvn spring-boot:run -Dspring.profiles.active=test1
$ mvn spring-boot:run -Dspring.profiles.active=staging
$ mvn spring-boot:run -Dspring.profiles.active=prod1
$ mvn spring-boot:run -Dspring.profiles.active=prod2
```

3. 로컬 테스트
[http://localhost:8080](http://localhost:8080)

## Spring Cloud Config 샘플
1. 위치
	- /spring-camp-env-spring-cloud-config-server
	- /spring-camp-env-spring-cloud-config-client
	- /spring-camp-env-spring-cloud-config-repo
2. 방법
```sh
$ cd spring-camp-env-spring-cloud-config-server
$ mvn spring-boot:run
$ cd spring-camp-env-spring-cloud-config-client
$ mvn spring-boot:run
```
3. 프로파일 별 실행방법
```sh
$ cd spring-camp-env-spring-cloud-config-client
$ mvn spring-boot:run -Dspring.profiles.active=local
$ mvn spring-boot:run -Dspring.profiles.active=test1
$ mvn spring-boot:run -Dspring.profiles.active=staging
$ mvn spring-boot:run -Dspring.profiles.active=prod1
$ mvn spring-boot:run -Dspring.profiles.active=prod2
```
4. 브라우저 로컬 테스트
- [http://localhost:8080](http://localhost:8080)

5. 원격 환경 변수 변경 테스트
	- 일단 현재 github 소스를 fork 하여 각자 github로 가져가야 테스트가 가능
	- /spring-camp-env-spring-cloud-config-server/src/main/resources/application.yml
		- 파일에서 환경변수가 저정될 github 주소를 변경
		- spring.cloud.config.server.git.uri: https://github.com/sbcoba/spring-camp-2015-sample
		  -> 이부분을 변경필요
		  spring.cloud.config.server.git.uri: https://github.com/자신의계정/spring-camp-2015-sample
	- springCampClientSample.yml 파일을 변경
		- git에 push
    	- 클라이언트 refresh
    		- ```sh
        	$ curl -X POST http://localhost:8080/refresh
        	```
    	- localhost:8080 새로고침
    	- 변경된 환경정보 확인
