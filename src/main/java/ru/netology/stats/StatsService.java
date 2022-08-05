package ru.netology.stats;

public class StatsService {

  
    // Метод для подсчета суммы всех продаж

    public int totalAllSales(long[] sales) {
        int sum = (int) sales[0];
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum;
    }

    // Метод для подсчета средней суммы продаж

    public double averageSalesAmount(long[] sales) {
        double sum = totalAllSales(sales);
        double average = sum / sales.length;

        return average;
    }

    // Метод для вывода номера месяца, в котором был пик продаж

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    private long[] getSales(long[] sales) {
        return sales;
    }


    // Метод для вывода номера месяца, в котором был минимум продаж

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    // Метод для подсчета количества месяцев, в которых продажи были ниже среднего

    public int numMonthsMinSales(long[] sales) {

        int numMinMonth = 0;

        double average = averageSalesAmount(sales);

        for (long sale : sales) {

            if (sale <= average) {
                numMinMonth = numMinMonth + 1;
            }
            numMinMonth = numMinMonth;
        }
        return numMinMonth;
    }

    // Метод для подсчета количества месяцев, в которых продажи были выше среднего
    public int numMonthsMaxSales(long[] sales) {

        int numMaxMonth = 0;

        double average = averageSalesAmount(sales);

        for (long sale : sales) {

            if (sale >= average) {
                numMaxMonth = numMaxMonth + 1;
            }
            numMaxMonth = numMaxMonth;
        }
        return numMaxMonth;
    }

}








