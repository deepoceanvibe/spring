package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fs")
public class FusionRestaurant implements Restaurant {
    // 필드 주입
    // @Autowired
    private Chef chef;
    // @Autowired
    private Course course;

    // 세터 주입 : 세터 위에 @Autowired 붙여줌
    // @Qualifier 를 파라미터 왼쪽에 붙이면 주입할 의존 객체를 지정할 수 있다.
    public void setChef(@Qualifier("jc") Chef chef) {
        this.chef = chef;
    }
    // @Autowired
    public void setCourse(@Qualifier("jco") Course course) {
        this.course = course;
    }

    // 생성자 주입
    @Autowired
    public FusionRestaurant(@Qualifier("cc") Chef chef, @Qualifier("cco") Course course) {
        this.chef = chef;
        this.course = course;
    }
    @Override
    public void order() {
        System.out.println("퓨전 레스토랑입니다.");
        course.combineMenu();
        chef.cook();
    }
}
