import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class test {
    public class SalesAmountTest{
 @Test
        public void shouldCalculateTheAmount(){
     StatsService service = new StatsService();
     int [] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
     int expectedSum = 180;
     int actualSum = service.salesAmount(amount);
     Assertions.assertEquals(expectedSum, actualSum);

 }

    }

}
