package ru.netology.stats;

public class StatsService {
    public long sum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }


        return sum;
    }



    public long average(long[] purchases) {
        long sum = sum(purchases);
        return sum / purchases.length;
    }


    public int maxSales(long[] purchases) {
        int maxMonthSales = (int) purchases[0];
        int monthMaxSales = 0;
        int count = 0;
        for (long purchase : purchases) {
            count++;
            if (maxMonthSales <= purchase) {
                maxMonthSales = (int) purchase;
                monthMaxSales = count;
            }
        }
        return monthMaxSales;
}

    public int minSales(long[] purchases) {
        int minMonthSales = (int) purchases[0];
        int monthMinSales = 0;
        int count = 0;
        for (long purchase : purchases) {
            count++;
            if (minMonthSales >= purchase) {
                minMonthSales = (int) purchase;
                monthMinSales = count;
            }
        }
        return monthMinSales;
    }

    public int monthsSalesBelowAverage(long[] purchases) {
        int average = (int) average(purchases);
        int monthsSalesBelowAverage = 0;
        int count = 0;
        for (long purchase : purchases) {
            if (average > purchase) {
                count++;
                monthsSalesBelowAverage = count;
            }
        }
        return monthsSalesBelowAverage;
    }

    public int monthsSalesOverAverage(long[] purchases) {
        int average = (int) average(purchases);
        int monthSalesOverAverage = 0;
        int count = 0;
        for (long purchase : purchases) {
            if (average < purchase) {
                count++;
                monthSalesOverAverage = count;
            }
        }
        return  monthSalesOverAverage;
    }
}