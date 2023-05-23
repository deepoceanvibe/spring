package com.spring.core.chap04;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

// @Component : 스프링 컨테이너에 자동으로 등록하는 어노테이션
@Component("jc")
public class JapaneseChef implements Chef {
    @Override
    public void cook() {
        System.out.println("최고의 일식 요리사 김일식 입니다.");
    }
}
