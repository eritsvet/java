package ru.mirea.pr3.ex45;

public class MovableCircle implements Movable
{
    public int radius;
    public MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle: radius = " + radius + "\ncenter - " + center.toString();
    }

    @Override
    public void moveUp()
    {
        center.moveUp();
    }

    @Override
    public void moveDown()
    {
        center.moveDown();
    }

    @Override
    public void moveRight()
    {
        center.moveRight();
    }

    @Override
    public void moveLeft()
    {
        center.moveLeft();
    }
}
