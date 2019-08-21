package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        int sum=0;
        while (sum<amount) {
            amount+=amount*percent/100;
            sum += monthly*12;
            year++;
        }
        return year;
    }
}