package ru.mirea.lab3;

public class TestDog
{
    public static void main(String[] args)
    {
        Dog d1 = new GreatDane("Алекс","черный",80);
        System.out.println(d1);
        d1.characterize();
        d1.bark();
        Basenji d2 = new Basenji("Джесс","желто-коричневый",41);
        System.out.println(d2);
        d2.characterize();
        d2.bark();
        Dog d3 = new CavalierKingCharlesSpaniel("Спотти", "трехцветный",33);
        System.out.println(d3);
        d3.characterize();
        System.out.println(d3.getName());
    }
}
