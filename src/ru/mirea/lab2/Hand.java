package ru.mirea.lab2;

public class Hand
{
    String objectInHand;
    public Hand()
    {
        objectInHand="ничего";
    }

    public String getObjectInHand() {
        return objectInHand;
    }

    public void setObjectInHand(String objectInHand) {
        this.objectInHand = objectInHand;
    }

    public void grab(String s)
    {
        System.out.println("Человек взял предмет "+s+" в руку");
        setObjectInHand(s);
    }
    public void release() {
        if (getObjectInHand() != "ничего")
            System.out.println("Человек отпустил предмет " + getObjectInHand());
        setObjectInHand("ничего");
    }
    public void inHand()
    {
        if (getObjectInHand() == "ничего")
            System.out.println("В руке ничего не находится");
        else
            System.out.println("В руке находится "+getObjectInHand());
    }
}
