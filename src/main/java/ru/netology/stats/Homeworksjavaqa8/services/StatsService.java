package ru.netology.stats.Homeworksjavaqa8.services;

public class StatsService {

    public int calculate(long[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += (int) sales[i];
        }
        return sumSales;
    }

    public long averageSumSales(long[] sales) {
        return calculate(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int minAverageSumSales(long[] sales) {
        int SumminSalesMonth = 0;
        long avg = averageSumSales(sales);

        for (long SumSales : sales) {
            if (SumSales < avg) {
                SumminSalesMonth++;
            }
        }

        return SumminSalesMonth;
    }

    public int maxAverageSumSales(long[] sales) {
        int maxSalesMonth = 0;
        long avg = averageSumSales(sales);
        for (long SumSales : sales) {
            if (SumSales > avg) {
                maxSalesMonth++;

            }
        }
        return maxSalesMonth;
    }
}