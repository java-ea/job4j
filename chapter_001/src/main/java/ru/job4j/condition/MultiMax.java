package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        if (third > result ? true : false) {
            result = third;
        }
        return result;
    }
}