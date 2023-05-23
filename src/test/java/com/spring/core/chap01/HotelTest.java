package com.spring.core.chap01;

import org.junit.jupiter.api.Test;

public class HotelTest {

    @Test
    public void hotelTest() {
        Hotel hotel = new Hotel();
        hotel.inform();
    }

    @Test
    public void chefTest() {
        Chef chef = new KoreanChef();
        chef.cook();
    }
}
