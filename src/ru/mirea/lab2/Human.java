package ru.mirea.lab2;
//Вариант 2
public class Human
{
    public Human()
    {
        System.out.println("Человек существует");
    }
    public void doSomething()
    {
        Hand hand = new Hand();
        Head head = new Head();
        Leg leg = new Leg();
        head.setThought("хочет поесть");
        head.setEmotion("печаль");
        head.think();
        head.feel();
        head.sniff("корица и гвоздика");
        leg.setPlace("кухня");
        leg.go();
        head.look("имбирное печенье");
        hand.grab("имбирное печенье");
        head.eat("имбирное печенье");
        head.setEmotion("счастье");
        head.feel();
    }
    public static void main(String args[])
    {
        Human man = new Human();
        man.doSomething();
    }
}
