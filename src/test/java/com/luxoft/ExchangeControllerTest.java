package com.luxoft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by qtr-ptc-1 on 9/1/2016.
 */
public class ExchangeControllerTest {

    ExchangeController controller = new ExchangeController();

    @Test
    public void testUSD(){
        String cur = "usd";
        String rate = controller.getExchange(cur);
        assertEquals("1.0",rate);
    }
}
