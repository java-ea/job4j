package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        ball.meet(hare);
        hare.tryEat(ball);
        ball.trick(hare);
        ball.goAhead();

        ball.meet(wolf);
        hare.tryEat(ball);
        ball.trick(wolf);
        ball.goAhead();

        ball.meet(fox);
        fox.tryEat(ball);
        fox.eatUp(ball);
    }
}