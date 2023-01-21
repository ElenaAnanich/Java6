package ru.netology.sqr.Java6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtServiceTest {
    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();
        int minNumber = 200;
        int maxNumber = 400;
        int expected = 6;
        int actual = service.calcSqrt(minNumber, maxNumber);

        Assertions.assertEquals(expected, actual);


    }
}


