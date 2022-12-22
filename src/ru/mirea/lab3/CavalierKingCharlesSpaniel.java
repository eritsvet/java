package ru.mirea.lab3;

public class CavalierKingCharlesSpaniel extends Dog
{
    public CavalierKingCharlesSpaniel(String name, String color, double height)
    {
        this.name=name;
        this.color=color;
        this.height=height;
    }

    @Override
    public String toString() {
        return "Порода собаки: кавалер кинг чарльз спаниель \nИмя - "+name+", окрас - "+color+", рост = "+height+" см";
    }

    @Override
    public void characterize() {
        System.out.println("Характер: игривый, привязчивый, общительный, бесстрашный, терпеливый, нежный");
    }

    @Override
    public void bark() {
        System.out.println("Гав");
    }
}
