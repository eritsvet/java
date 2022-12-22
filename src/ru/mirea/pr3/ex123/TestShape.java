package ru.mirea.pr3.ex123;

import ru.mirea.pr3.ex123.Circle;
import ru.mirea.pr3.ex123.Rectangle;
import ru.mirea.pr3.ex123.Shape;
import ru.mirea.pr3.ex123.Square;

public class TestShape {
    public static void main(String[] args)
    {
        Shape s1 = new Circle(5.5, "RED", false); // возможно использование методов Circle, определенных в Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); (метод не относится к Shape)

        System.out.println("_____________________________________________________");

        Circle c1 = (Circle)s1; // возможно использование методов Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        System.out.println("_____________________________________________________");

        //Shape s2 = new Shape();(Shape - абстрактный класс)

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // возможно использование методов Rectangle, определенных в Shape
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); (метод не относится к Shape)

        System.out.println("_____________________________________________________");

        Rectangle r1 = (Rectangle)s3;// возможно использование методов Rectangle
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        System.out.println("_____________________________________________________");

        Shape s4 = new Square(6.6); // возможно использование методов Square, определенных в Shape
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); (метод не относится к Shape)

        System.out.println("_____________________________________________________");

        Rectangle r2 = (Rectangle)s4;// возможно использование методов Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); (метод не относится к Rectangle)
        System.out.println(r2.getLength());

        System.out.println("_____________________________________________________");

        Square sq1 = (Square)r2;// возможно использование методов Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
