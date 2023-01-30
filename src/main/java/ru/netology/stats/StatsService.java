package ru.netology.stats;

public class StatsService {

    //1. Сумма всех продаж
    public long countSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    //2. Средняя сумма продаж в месяц
    public long countAverage(long[] sales) {
        return countSum(sales) / sales.length;
    }

    //3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int countNumberMaxMonth(long[] sales) {
        int MaxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[MaxMonth]) {
                MaxMonth = month;
            }
            month = month + 1;
        }
        return MaxMonth + 1;
    }

    //4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int countNumberMinMonth(long[] sales) {
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

    //5. Количество месяцев, в которых продажи были ниже среднего
    public int amountMonthsUnderAverage(long[] sales) {
        int count = 0;
        long salesAverage = countAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAverage) {
                count++;
            }
        }
        return count;
    }

    //6. Количество месяцев, в которых продажи были выше среднего
    public int amountMonthsOverAverage(long[] sales) {
        int count = 0;
        long salesAverage = countAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAverage) {
                count++;
            }
        }
        return count;
    }

}
