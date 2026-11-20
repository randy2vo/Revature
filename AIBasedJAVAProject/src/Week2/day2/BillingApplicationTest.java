package Week2.day2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class BillingApplicationTest {

	@Test
    void below1000GetsNoDiscount() {
        assertEquals(0.0, BillingApplication.calculateDiscount(800), 0.001);
    }

    @Test
    void exactly1000GetsFivePercentDiscount() {
        assertEquals(50.0, BillingApplication.calculateDiscount(1000), 0.001);
    }

    @Test
    void ammount4999GetsFivePercentDiscount() {
        assertEquals(249.95, BillingApplication.calculateDiscount(4999), 0.001);
    }

    @Test
    void exactly5000GetsTenPercentDiscount() {
        assertEquals(500.0, BillingApplication.calculateDiscount(5000), 0.001);
    }

    @Test
    void amount7000GetsTenPercentDiscount() {
        assertEquals(700.0, BillingApplication.calculateDiscount(7000), 0.001);
    }
}

