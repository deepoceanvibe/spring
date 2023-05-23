package com.spring.core.chap03;

public class FusionRestaurant implements Restaurant {
    private Chef chef;
    private Course course;

    // 생성자의 파라미터로 들어온 객체를 셰프, 코스로 주입함 !
    public FusionRestaurant(Chef chef, Course course) {
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
