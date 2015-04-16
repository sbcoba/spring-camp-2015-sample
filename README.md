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

3. 로컬 테스트
[http://localhost:8080](http://localhost:8080)
