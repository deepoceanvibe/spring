package com.spring.core.chap03;

import com.spring.core.chap03.config.HotelConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HotelConfigTest {

    // 스프링 컨테이너에 등록된 빈 가져오기
    // HotelConfig 클래스에 정의된 자료를 활용하겠다는 의미
    // -> HotelConfig 설계도(정보)를 어플리케이션컨텍스트 공장에 넘겨주고, ac가 그걸 기반으로 생산한다.
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(HotelConfig.class);

    @Test
    void springDITest() {
        // hotel에 'ac에 호텔 상품을 줘서' 넘김
        Hotel hotel = ac.getBean(Hotel.class);
        Chef Koreanchef = ac.getBean(KoreanChef.class);

        hotel.inform();
    }


}
