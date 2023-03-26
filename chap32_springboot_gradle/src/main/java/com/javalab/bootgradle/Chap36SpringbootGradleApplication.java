package com.javalab.bootgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * [메인 메소드가 있는 메인 클래스]
 * https://cafe.naver.com/freeflex/295
 * @SpringBootApplication
 * 	1) @SpringBootConfiguration : 애플리케이션의 구성을 제공하는 어노테이션(@Configuration역할)
 * 	2) @EnableAutoConfiguration : ﻿사전에 정의한 라이브러리들을 Bean으로 등록해 주는 어노테이션
 * 	3) @ComponentScan : @Component 어노테이션을 명시한 클래스들을 Scan 하여 해당 클래스를 
 * 						Bean으로 만들어 Spring Continaer에 등록 
 * 		@SpringBootApplication 기준으로 하위 package의 모든 Bean을 자동으로 구성. 그래서
 * 		@SpringBootApplication 붙은 클래스가 최상위 패키지에 위치해야 한다.
 */
@SpringBootApplication
public class Chap36SpringbootGradleApplication {
	public static void main(String[] args) {
		SpringApplication.run(Chap36SpringbootGradleApplication.class, args);
	}

}
