package ru.job4j.condition;

public class SqArea {


    public static int square(int p, int k) {
        int h = p / (2 * (1 + k));
       /*
       к этому я пришол вот так:
       p=2*(h+w)
       p=2h+2w
       p=2(h+w)
       p/2=h+w
       заменяю w на h, потому что по условию w больше у k раз за h.
       p/2=h+h*k
       выношу h за скобочки.
       p/2=h(1+k)
       h=p/(2*(1+k)
      */
        int w = h * k;
        int s = h * w;
        return s;
    }

    public static void main(String[] args) {
        int result1 = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);

        int result2 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }
}