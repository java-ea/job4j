package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;
    private String act;

    public void show() {
        System.out.print(this.name);
        System.out.print(this.act);
        System.out.println(this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void doing(String doing) {
        this.act = doing;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gav ");
        gav.doing("eating ");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("black ");
        black.doing("eating ");
        black.eat("fish");
        black.show();
    }
}