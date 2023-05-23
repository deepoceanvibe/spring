package com.spring.core.chap03.config;

import com.spring.core.chap03.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// HotelConfig 클래스가 주입에 필요한 객체들을 관리할 것임을 명시
@Configuration
public class HotelConfig {
    // 스프링 방식

    // 빈 등록 : 스프링이 관리할 객체를 알려주는 방법
    // -> 스프링 컨테이너에 KoreanChef, KoreanCourse 객체가 생성됨
    // 방법 : @Bean 어노테이션을 생성코드 위에 붙여줌

    @Bean
    public Chef chef() {
        return new KoreanChef();
    }

    @Bean
    public Course KoreanCourse() {
        return new KoreanCourse();
    }

    // 퓨전레스토랑에 셰프정보, 한식코스정보 집어넣음
    @Bean
    public Restaurant restaurant() {
        return new FusionRestaurant(chef(), KoreanCourse());
    }

    // 호텔에 레스토랑정보, 셰프정보 집어넣음
    @Bean
    public Hotel hotel() {
        return new Hotel(restaurant(), chef());
    }


}
