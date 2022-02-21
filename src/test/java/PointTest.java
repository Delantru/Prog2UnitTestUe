import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Point Testing")
public class PointTest {

    @Test
    @DisplayName("Same Position")
    public void testCalcDistance_samePosition(){
        Point a = new Point(1,1);
        Point b = new Point(1,1);

        double distanceActual = a.calcDistance(b);
        double distanceExpected = 0.0;

        assertEquals(distanceExpected, distanceActual);
    }

    @Test
    @DisplayName("B higher")
    void testCalcDistance_bHigher(){
        Point a = new Point(1,1);
        Point b = new Point(2,2);

        double distanceActual = a.calcDistance(b);
        double distanceExpected = 1.414;

        assertEquals(distanceExpected, distanceActual, 0.001);
    }

    @Test
    @DisplayName("A higher")
    void testCalcDistance_aHigher(){
        Point a = new Point(2,2);
        Point b = new Point(1,1);

        double distanceActual = a.calcDistance(b);
        double distanceExpected = 1.414;

        assertEquals(distanceExpected, distanceActual, 0.001);
    }

    @Test
    @DisplayName("Null Value")
    void testCalcDistance_null(){
        Point a = new Point(1,1);

        assertThrows(NullPointerException.class, () -> a.calcDistance(null));
    }

    @Test
    void testCalcDistance_aNeg(){
        Point a = new Point(-1,-1);
        Point b = new Point(1,1);

        double distanceActual = a.calcDistance(b);
        double distanceExpected = 2.828;

        assertEquals(distanceExpected, distanceActual, 0.001);
    }
    @Test
    void testCalcDistance_bNeg(){
        Point a = new Point(1,1);
        Point b = new Point(-1,-1);

        double distanceActual = a.calcDistance(b);
        double distanceExpected = 2.828;

        assertEquals(distanceExpected, distanceActual, 0.001);
    }
}