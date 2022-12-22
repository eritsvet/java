package ru.mirea.pr3.ex45;

public class TestMovable
{
    public static void main(String[] args)
    {
        Movable p = new MovablePoint(0, 0,8 ,7);
        System.out.println("Point:");
        System.out.println(p);
        p.moveUp();
        p.moveRight();
        System.out.println("Up+Right =>" + p);
        System.out.println(String.format("%64s","").replace(' ','_'));

        System.out.println("Circle:");
        Movable c = new MovableCircle(0, 0, 5, 2, 9);
        System.out.println(c);
        c.moveDown();
        c.moveRight();
        System.out.println("Down+Right => " + c);
        System.out.println(String.format("%64s","").replace(' ','_'));

        System.out.println("Rectangle:");
        Movable r = new MovableRectangle(0, 0, 6, 3, 1,4);
        System.out.println(r);
        r.moveLeft();
        r.moveUp();
        System.out.println("Left+Up => " + r);
    }
}
