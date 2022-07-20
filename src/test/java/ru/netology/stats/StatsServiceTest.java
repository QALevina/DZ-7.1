package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test  // Метод для подсчета суммы всех продаж
    public void littleSalesData() {
        StatsService service = new StatsService();

        long[] sales = {0, 1};

        int expectedSum = 1;
        int actualSum = service.totalAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test  // Метод для подсчета средней суммы продаж
    public void noSalesData() {
        StatsService service = new StatsService();

        long[] sales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        double expectedAverage = 0;
        double actualAverage = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test  // Метод для вывода номера месяца, в котором был пик продаж
    public void sameAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};

        int expectedMax = 12;
        int actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test  // Метод для вывода номера месяца, в котором был минимум продаж
    public void sameMinAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int expectedMin = 12;
        int actualMin = service.minSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test  //Метод для подсчета количества месяцев, в которых продажи были ниже среднего
    public void sameMinAmountMonth() {
        StatsService service = new StatsService();

        long[] sales = {0, 0, 0, 0, 0};

        int expectedNumMin = 5;
        int actualNumMin = service.numMonthsMinSales(sales);

        Assertions.assertEquals(expectedNumMin, actualNumMin);
    }

    @Test  //Метод для подсчета количества месяцев, в которых продажи были выше среднего
    public void OneAmountMonth() {
        StatsService service = new StatsService();

        long[] sales = {0, 0, 0, 0, 0, 1000};

        int expectedNumMax = 1;
        int actualNumMax = service.numMonthsMaxSales(sales);

        Assertions.assertEquals(expectedNumMax, actualNumMax);
    }
}
