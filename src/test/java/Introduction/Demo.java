package Introduction;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class Demo {

    @Test
    public void testIfNumber4isEven(){
// duomenys reikalingi testui:
        int actualInput = 4;
        int expectedResults = 0;
        int actualResults;

// testo veiksmas
        actualResults = actualInput % 2;

// palyginimas
        Assert.assertEquals(actualResults, expectedResults);   //buins assert turti kikvieno testo gale

    }

    @Test
    public void testIfNumber5isNotEven(){
// duomenys reikalingi testui:
        int actualInput = 5;
        int expectedResults = 1;        // 1 rodo, kad yra liekana, tai nesidalina be liekanos
        int actualResults;

// testo veiksmas
        actualResults = actualInput % 2;

// palyginimas
        Assert.assertTrue(actualResults == expectedResults,
                "Actual: "+ actualResults + ", Expected: " + expectedResults);

    }
    @Test
    public void testIfTimeNowIsNot19Hour(){
        //Duomenys:
        int notExpectedTime = 19;
        int actualTime;
        boolean isSameTime;

        //Test veiksmas
        actualTime = LocalTime.now().getHour();
        isSameTime = notExpectedTime == actualTime; // false dazniausiai grazins

        //palyginimas

        Assert.assertFalse(
                IsSameTime,
                String.format("Expected: %s, Actual: %s", notExpectedTime, actualTime)
        );

    }

}
