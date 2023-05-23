package com.spring.core.chap03;

public class ChineseRestaurant implements Restaurant {
    // 셰프 선언
    private Chef chef;

    // 코스 선언
    private Course course;

    public ChineseRestaurant() {
        this.chef = new ChineseChef();
        this.course = new ChineseCourse();
    }
    @Override
    public void order() {
        System.out.println("중식 레스토랑입니다.");
        course.combineMenu();
        chef.cook();
    }
}
