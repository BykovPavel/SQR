package ru.netology.sqr.SQR.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void shouldCalcQuantity(int expected, int minBorder, int maxBorder) {
        SQRService service = new SQRService();
        int actual = service.numberOfSquares(minBorder, maxBorder);
        Assertions.assertEquals(expected, actual);
    }
}
