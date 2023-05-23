package com.spring.core.chap04.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 해당 클래스에 정의된 빈들을 스프링 컨테이너에서 관리하도록 처리
@Configuration

// 컨테이너 내부에 "범위(com.spring.core.chap04)"만 등록해주는 어노테이션
@ComponentScan(basePackages = "com.spring.core.chap04")
public class HotelAutoConfig {
}
