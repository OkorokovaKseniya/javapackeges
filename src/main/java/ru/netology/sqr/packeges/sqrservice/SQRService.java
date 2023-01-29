package ru.netology.sqr.packeges.sqrservice;

public class SQRService {

    public int calcSqrService(int max, int min) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                counter++;
            }
        }
        return counter;
    }
}
