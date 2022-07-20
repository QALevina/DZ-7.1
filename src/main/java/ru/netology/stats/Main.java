package ru.netology.stats;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = service.totalAllSales(sales);
        System.out.println("Общая сумма продаж равна " + sum);

        double average = service.averageSalesAmount(sales);
        System.out.println("Средняя сумма продаж равна " + average);


        int max = service.maxSales(sales);
        System.out.println("Максимальные продажи были в " + max + " месяце");


        int min = service.minSales(sales);
        System.out.println("Минимальные продажи были в " + min + " месяце");

        int numMinMonth = service.numMonthsMinSales(sales);
        System.out.println("В " + numMinMonth + " месяцах были продажи ниже среднего");

        int numMaxMonth = service.numMonthsMaxSales(sales);
        System.out.println("В " + numMaxMonth + " месяцах были продажи выше среднего");
    }

}
