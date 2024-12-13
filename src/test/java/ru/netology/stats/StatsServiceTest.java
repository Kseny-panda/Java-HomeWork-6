package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    // Тест на сумму всех продаж
    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSumOfAllSales = 180;
        long actualeSumOfAllSales = service.sumOfAllSales(sales);

        Assertions.assertEquals(expectedSumOfAllSales, actualeSumOfAllSales);
    }


    // средняя сумма продаж в месяц
    @Test
    public void averageSalesAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSalesAmount = 15;
        long actualeAverageSalesAmount = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverageSalesAmount, actualeAverageSalesAmount);
    }


    // номер месяца на максимальную сумму продаж
    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxDay = 8;
        int actualeMaxDay = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxDay, actualeMaxDay);
    }


    // номер месяца на минимальную сумму продаж
    @Test
    public void minSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinDay = 9;
        int actualeMinDay = service.minSales(sales);

        Assertions.assertEquals(expectedMinDay, actualeMinDay);
    }


    // количество месяцев, в которых продажи были ниже среднего
    @Test
    public void salesAreBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverage = 5;
        int actualeBelowAverage = service.salesAreBelowAverage(sales);

        Assertions.assertEquals(expectedBelowAverage, actualeBelowAverage);

    }


    // количество месяцев, в которых продажи были ниже среднего
    @Test
    public void salesAreAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAverage = 5;
        int actualeAboveAverage = service.salesAreBelowAverage(sales);

        Assertions.assertEquals(expectedAboveAverage, actualeAboveAverage);

    }
}