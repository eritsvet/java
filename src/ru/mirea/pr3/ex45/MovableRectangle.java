package ru.mirea.pr3.ex45;

public class MovableRectangle implements Movable
{
    public MovablePoint topLeft, bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString()
    {
        return "MovableRectangle: \ntopLeft - " + topLeft.toString() + "\nbottomRight - " + bottomRight.toString();
    }

    @Override
    public void moveUp()
    {
        if (equals()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else System.out.println("Скорости точек не совпадают");
    }

    @Override
    public void moveDown()
    {
        if (equals()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else System.out.println("Скорости точек не совпадают");
    }

    @Override
    public void moveRight()
    {
        if (equals()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else System.out.println("Скорости точек не совпадают");
    }

    @Override
    public void moveLeft()
    {
        if (equals()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else System.out.println("Скорости точек не совпадают");
    }

    public boolean equals()
    {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
}
