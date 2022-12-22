package ru.mirea.lab3;

public class Basenji extends Dog
{
    public Basenji(String name, String color, double height)
    {
        this.name=name;
        this.color=color;
        this.height=height;
    }

    @Override
    public String toString() {
        return "Порода собаки: басенджи \nИмя - "+name+", окрас - "+color+", рост = "+height+" см";
    }

    @Override
    public void characterize() {
        System.out.println("Характер: любопытный, спокойный, умный, привязчивый, энергичный, бдительный");
    }

    @Override
    public void bark() {
        System.out.println("Собаки данной породы не умеют лаять");
    }
}
