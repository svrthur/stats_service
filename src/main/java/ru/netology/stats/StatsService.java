package ru.netology.stats;

public class StatsService {

    // Метод для расчета суммы всех продаж
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Метод для расчета средней суммы продаж
    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    // Метод для поиска месяца с максимальными продажами
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // Метод для поиска месяца с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Метод для подсчета месяцев с продажами ниже среднего
    public int belowAverageSales(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета месяцев с продажами выше среднего
    public int aboveAverageSales(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
