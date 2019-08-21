package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            for (int j = i; j % 2 == 0; ) {
                count++;
                break;
            }
        }
        return count;
    }
}