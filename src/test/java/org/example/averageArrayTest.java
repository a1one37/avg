package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageArrayTest {

    @Test
    public void countingAverage(){
        double a = new AverageArray().countingAverage(new int[]{0,1,2,3,4,5,6,7,8,9,10});
        Assertions.assertEquals(5.0, a);
    }


    @Test
    void isNotSquare() {
        Assertions.assertFalse(AverageArray.isSquare(new Object[][]{
                new Object[8],
                new Object[8],
                new Object[9]
        }));
    }
}