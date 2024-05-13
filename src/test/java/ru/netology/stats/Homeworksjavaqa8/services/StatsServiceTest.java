package ru.netology.stats.Homeworksjavaqa8.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedsumSales = 180;
        int actualsumSales = service.calculate(sales);

        Assertions.assertEquals(expectedsumSales, actualsumSales);
    }

    @Test
    public void averageSumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageSumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthSales1() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedmaxSales = 8;
        int actualmaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedmaxSales, actualmaxSales);
    }

    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedminSales = 9;
        int actualminSales = service.minSales(sales);

        Assertions.assertEquals(expectedminSales, actualminSales);
    }


    @Test
    public void minAverageMonthSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedminAverageSumSales = 5;
        int actualminAverageSumSales = service.minAverageSumSales(sales);

        Assertions.assertEquals(expectedminAverageSumSales, actualminAverageSumSales);
    }


    @Test
    public void maxAverageMonthSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedmaxAverageSumSales = 5;
        int actualmaxAverageSumSales = service.maxAverageSumSales(sales);

        Assertions.assertEquals(expectedmaxAverageSumSales, actualmaxAverageSumSales);
    }
}