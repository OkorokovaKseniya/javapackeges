package ru.netology.sqr.packeges.sqrservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test

    public void shouldFindExact() {
        SQRService service = new SQRService();
        int expected = 6;
        int actual = service.calcSqrService(400, 200);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindInexact() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSqrService(300, 200);
        Assertions.assertEquals(expected, actual);
    }


}
