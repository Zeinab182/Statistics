package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldSum(){
        long expected = 180;
        long actual = service.sum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverage() {
        long expected = 15;
        long actual = service.average(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        long expected = 8;

        long actual = service.maxSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void minSales () {
        long expected = 9;
        long actual = service.minSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void monthsSalesBelowAverage () {
        long expected = 5;
        long actual = service.monthsSalesBelowAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void monthsSalesAboveAverage () {
        long expected = 5;
        long actual = service.monthsSalesOverAverage(purchases);

        assertEquals(expected, actual);
    }

}



