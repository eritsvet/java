package ru.mirea.lab4;

public class TestPrice
{
    public static void main(String[] args)
    {
        Priceable p = new Phone(55900, "Apple Iphone 11");
        System.out.println(p);
        p = new Bag(4900, "Arny Praht", "Melt");
        System.out.println(p);
        System.out.println(p.getPrice());
        p = new Perfume(5500, "Versace", "Bright Crystal Absolu", 90);
        System.out.println(p);
    }
}
