package com.spring.core.chep02.config;

import com.spring.core.chep02.*;

// 현재까지 최상위 객체인 호텔을 운영하기 위해 필요함
// 모든 객체들을 생성하고, 주입해주는 기능
// Bean Factory 패턴

public class HotelManager {

    public Chef chef() {                // 이거만 고치면 됨!
        return new JapaneseChef();
    }

    public Course course() {            // 이거만 고치면 됨!
        return new JapaneseCourse();
    }

    public Restaurant restaurant() {
        return new FusionRestaurant(chef(), course());
    }

    public Hotel hotel() {
        return new Hotel(restaurant(),chef());
    }
}
