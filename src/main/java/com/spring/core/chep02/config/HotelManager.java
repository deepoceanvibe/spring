package com.spring.core.chep02.config;

import com.spring.core.chep02.*;

// 다른 클래스(Hotel Manager)에서 특정 클래스(Hotel, Restaurant)에 어떤 자료형이 대입될지 결정해주는 패턴
// Bean Factory 패턴 (공장)

public class HotelManager {

    public Chef chef() {
        return new JapaneseChef();
    }

    public Course course() {            // 이거만 고치면 됨!
        return new JapaneseCourse();
    }

    public Restaurant restaurant() {        // 호텔 매니저에서 '레스토랑'에 어떤 자료형이 대입될지 결정함.
        return new FusionRestaurant(chef(), course());
    }

    public Hotel hotel() {                  // 호텔 매니저에서 '호텔'에 어떤 자료형이 대입될지 결정함.
        return new Hotel(restaurant(),chef());
    }
}
