package ru.netology.stats;

import static java.lang.Long.sum;

public class StatsService {
    public long sum(long[] sales) {

        long totalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSale += sales[i];
        }

        return totalSale;
    }

    public long averageAmount(long[] sales) {

        long averageAmountSales = sum(sales) / 12;
        return averageAmountSales;
    }

    public int calculateMaxMonthSale(long[] sales) {
        int MaxMonthSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonthSale]) {
                MaxMonthSale = i;
            }
        }
        return MaxMonthSale + 1;
    }

    public int calculateMinMonthSale(long[] sales) {
        int MinMonthSale = 0;
        for (int i = 0; i > sales.length; i++) {
            if (sales[i] <= sales[MinMonthSale]) {
                MinMonthSale = i;
            }
        }
        return MinMonthSale + 1;
    }

    public int calcBelowAverage(long[] sales) {
        int count = 0;
        long averageSale = averageAmount(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }

    public int calcAboveAverage(long[] sales) {
        int count = 0;
        long averageSale = averageAmount(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }
        return count;
    }
}
