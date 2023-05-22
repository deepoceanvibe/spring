package com.spring.core.chap02;

import com.spring.core.chep02.Hotel;
import com.spring.core.chep02.config.HotelManager;
import org.junit.jupiter.api.Test;

public class HotelManagerTest {

    @Test
    public void diTest() {
        HotelManager manager = new HotelManager();
        Hotel hotel = manager.hotel();      // ! 매니저에서 hotel() 호출하면, 내부적으로 hotel 조립함
        hotel.inform();
    }
}
