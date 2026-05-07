package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CurrencyConverterTest {

    CurrencyConverter c = new CurrencyConverter();

    @Test
    public void testRupeeToDollar() {
        assertEquals(1, c.rupeeToDollar(83), 0.1);
    }

    @Test
    public void testDollarToRupee() {
        assertEquals(83, c.dollarToRupee(1), 0.1);
    }
}
