import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
            StatsService service = new StatsService();
        long[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.salesAmount(amount));
        System.out.println(service.averagSalesAmount(amount));
        System.out.println(service.maxSalesMonth(amount));
        System.out.println(service.minSalesMonth(amount));
        System.out.println(service.monthsBelowAverage(amount));
        System.out.println(service.monthsAboveAverage(amount));
    }
    }
