package ru.job4j.oopexams;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int count = 0;
        int change = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (change - coins[i] >= 0) {
                rsl[count] = coins[i];
                change -= coins[i];
                count++;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
