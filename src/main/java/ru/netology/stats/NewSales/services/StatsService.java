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

    public int sumSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum;

    }

    public int averageSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum / sales.length;
    }

    public int belowTheAverageSales(long[] sales) {
        int sum = 0;
        long average = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        for (int index = 0; index < sales.length; index++) {
            average = (sum / sales.length);

            int count = 0;
            for (int month = 0; month < sales.length; month++) {
                if (sales[month] < average) {
                    count++;
                }
            }
            return count;
        }
        return sum;
    }

    public int aboveTheAverageSales(long[] sales) {
        int sum = 0;
        long average = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        for (int index = 0; index < sales.length; index++) {
            average = (sum / sales.length);

            int count = 0;
            for (int month = 0; month < sales.length; month++) {
                if (sales[month] > average) {
                    count++;
                }
            }
            return count;
        }
        return sum;
    }
}