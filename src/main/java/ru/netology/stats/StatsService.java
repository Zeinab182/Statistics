package ru.netology.stats;

//    1

public class StatsService {
    public long sum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }


        return sum;
    }

//    2

    public long average(long[] purchases) {
        long sum = sum(purchases);
        return sum / purchases.length;
    }

//    3

    public long maxSales(long[] purchases) {
        long maxMonthSales = purchases[0];
        int monthMaxSales = 0;
        int count = 0;
        for (long purchase : purchases) {
            count++;
            if (maxMonthSales <= purchase) {
                maxMonthSales = purchase;
                monthMaxSales = count;
            }
        }
        return monthMaxSales;
}

//    4

    public long minSales(long[] purchases) {
        long minMonthSales = purchases[0];
        int monthMinSales = 0;
        int count = 0;
        for (long purchase : purchases) {
            count++;
            if (minMonthSales >= purchase) {
                minMonthSales =  purchase;
                monthMinSales = count;
            }
        }
        return monthMinSales;
    }

//    5

    public long monthsSalesBelowAverage(long[] purchases) {
        long average = average(purchases);
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

//    6

    public long monthsSalesOverAverage(long[] purchases) {
        long average = average(purchases);
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