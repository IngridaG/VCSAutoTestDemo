package Introduction;

import java.time.DayOfWeek;
import java.time.LocalDate;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Classwork {
    @Test
    public void testIfNumber995isNotEven() {
// duomenys:
        int actualInput = 995;
        int expectedResults = 0;
        int actualResults;
// testo veiksmas:
        actualResults = actualInput % 3;

// palyginimas:
        Assert.assertEquals(actualResults, expectedResults);

    }
    @Test
    public void ifIsWednesdayToday(){
        DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;
        DayOfWeek actualDayOfWeekDay = LocalDate.now().getDayOfWeek();
   Assert.assertEquals(actualDayOfWeekDay,expectedDayOfWeek );
    }

@Test
public void testWaitFor5Seconds(){

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
}

 @Test
 public void countOfEvenNumbersBetween1And10(){
        int expectedEvenNumberCount = 5;
        int actualEvenNumberCount = 0;
        for (int i = 1; i<= 10; i++){
            if (i% 2 == 0) {
                actualEvenNumberCount++;
            }
        }
        Assert.assertEquals(actualEvenNumberCount, expectedEvenNumberCount);
 }
}



//
//Testas “žalias” jeigu 995 dalijasi iš 3 (be liekanos)
//
//        Testas “žalias” jeigu šiandien trečiadienis
//
//        Testas “žalias” po to, kai “palaukia” 5 sekundes
//
//        Bonus: Testas “žalias” jei nuo 1 iki 10 yra 4 lyginiai skaičiai