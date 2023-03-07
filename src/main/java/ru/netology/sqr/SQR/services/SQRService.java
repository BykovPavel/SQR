package ru.netology.sqr.SQR.services;

public class SQRService {
    public int numberOfSquares(int minBorder, int maxBorder) {
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minBorder) {
                if (i * i <= maxBorder) {
                    quantity++;
                }
            }
        }
        return quantity;
    }
}
