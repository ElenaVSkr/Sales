import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.NewSales.services.StatsService;

public class StatsServiceTest {

    @Test
    public void monthWithMinimalSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println(actualMonth);
    }

    @Test
    public void monthWithMaximumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println(actualMonth);

    }

    @Test
    public void sumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long count = service.sumSales(sales);

        System.out.println(count);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long count = service.averageSales(sales);

        System.out.println(count);
    }

    @Test
    public void belowTheAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.belowTheAverageSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println(actualMonth);
    }

    @Test
    public void aboveTheAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.aboveTheAverageSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println(actualMonth);
    }
}