package ru.netology.stats;


public class StatsService {

    // сумма всех продаж
    public int sumOfAllSales(int[] sales) {
        int allSales = 0;
        for (int sale : sales) {
            allSales += sale;
        }
        return allSales;
    }

    // средняя сумма продаж в месяц
    public int averageSalesAmount(int[] sales) {
        int allSales = 0;
        for (int sale : sales) {
            allSales += sale;
        }
        int averageSalesAmount = allSales / 12;

        return averageSalesAmount;
    }

    // номер месяца на максимальную сумму продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    // номер месяца на минимальную сумму продаж
    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int salesAreBelowAverage(int[] sales) {
        int averageSalesAmount = averageSalesAmount(sales);
        int belowAverage = 0;

        for (int sale : sales) {
            if (sale < averageSalesAmount) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    // количество месяцев, в которых продажи были выше среднего
    public int salesAreAboveAverage(int[] sales) {
        int averageSalesAmount = averageSalesAmount(sales);
        int aboveAverage = 0;

        for (int sale : sales) {
            if (sale > averageSalesAmount) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}


