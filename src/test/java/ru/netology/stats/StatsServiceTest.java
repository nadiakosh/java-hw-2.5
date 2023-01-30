package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.countSum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.countAverage(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumberMaxMonth() {
        StatsService service = new StatsService();
        long[] NumberMaxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.countNumberMaxMonth(NumberMaxMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumberMinMonth() {
        StatsService service = new StatsService();
        long[] NumberMinMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.countNumberMinMonth(NumberMinMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountMonthsUnderAvg() {
        StatsService service = new StatsService();
        long[] amountMonthsUnderAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.amountMonthsUnderAverage(amountMonthsUnderAverage);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void amountMonthsOverAverage() {
        StatsService service = new StatsService();
        long[] amountMonthOverAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.amountMonthsOverAverage(amountMonthOverAverage);

        Assertions.assertEquals(expected, actual);
    }

}