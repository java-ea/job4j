package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        int prime;
        for (int i = 2; i <= finish; i++) {
            prime = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    prime++;
                }
            }
            if (prime <= 2) {
                count++;
            }
        }
        return count;
    }
}
