package ru.mirea.pr2;

public class TestMovingBall
{
    public static void main(String[] args) {
        MovingBall mb1 = new MovingBall(100, 100);
        System.out.println(mb1);
        mb1.move(30, 15);
        System.out.println(mb1);
    }
}
