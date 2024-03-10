package ru.netology.stats.NewSales.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
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

    public long sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum;

    }

    public long averageSales(long[] sales) {
        long sum = sumSales(sales);
        long average = 0;

        for (int i = 0; i < sales.length; i++) {
            average = sum / sales.length;
        }

        return average;
    }

    public int belowTheAverageSales(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] < average) {
                count++;
            }
        }
        return count;
    }


    public int aboveTheAverageSales(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] > average) {
                count++;
            }
        }
        return count;
    }
}