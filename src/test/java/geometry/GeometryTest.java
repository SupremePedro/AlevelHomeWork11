package geometry;

import org.junit.Test;
import ua.com.alevel.geometry.Geometry2DCalculator;
import ua.com.alevel.geometry.InvalidLengthType;
import ua.com.alevel.geometry.LengthType;

import static org.junit.Assert.*;
import static ua.com.alevel.geometry.Geometry2DCalculator.*;

public class GeometryTest {
    @Test
    public void checkGetTriangleSquare(){

        assertEquals(726.0,getTriangleSquare(23,4,5,6,35,43),0.0001);
        assertFalse(getTriangleSquare(23,4,5,6,35,43)<0);
    }

    @Test
    public void checkGetCircleSquare(){
        try {
            LengthType radius  = new LengthType(10);
            assertEquals(314.1592653589793,getCircleSquare(radius),0.0001);
            assertTrue(getCircleSquare(radius)>0);
        }catch (InvalidLengthType e){
            e.printStackTrace();
        }

    }
    @Test
    public void checkGetParallelogramSquare(){
        try {
            LengthType length = new LengthType(42);
            LengthType base = new LengthType(23);
            assertEquals(966.0, getParallelogramSquare(length, base), 0.0001);
            assertTrue(getParallelogramSquare(length, base) > 0);
        }catch (InvalidLengthType e){
            e.printStackTrace();
        }
    }
}
