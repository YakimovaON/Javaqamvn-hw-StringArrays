package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long averageSum(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        int maxSale = (int) sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxMonth = i;
                maxSale = (int) sales[i];
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        int minSale = (int) sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMonth = i;
                minSale = (int) sales[i];
            }
        }
        return minMonth + 1;
    }

    public int MonthSalesLowerAverage(long[] sales) {
        long averageSum = averageSum(sales);
        int lowerMonth = 0;
        for (long sale : sales) {
            if (sale < averageSum) {
                lowerMonth++;
            }
        }
        return lowerMonth;
    }
    public int MonthSalesHigherAverage(long[] sales) {
        long averageSum = averageSum(sales);
        int higherMonth = 0;
        for (long sale : sales) {
            if (sale > averageSum) {
                higherMonth++;
            }
        }
        return higherMonth;
    }
}

