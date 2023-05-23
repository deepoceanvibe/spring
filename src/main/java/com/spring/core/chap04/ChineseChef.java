package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("cc")
public class ChineseChef implements Chef {
    @Override
    public void cook() {
        System.out.println("중식 요리 마스터 최중식 입니다.");
    }
}
