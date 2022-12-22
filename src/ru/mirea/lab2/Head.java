package ru.mirea.lab2;

public class Head
{
    public String thought;
    public String emotion;
    public Head()
    {
        this.thought="пустота";
        this.emotion="спокойствие";
    }
    public void setThought(String thought)
    {
        this.thought=thought;
    }
    public void setEmotion(String emotion)
    {
        this.emotion=emotion;
    }
    public String getThought()
    {
        return thought;
    }
    public String getEmotion()
    {
        return emotion;
    }
    public void look(String seen)
    {
        System.out.println("Человек увидел следующее: " + seen);
        this.thought="увидел следующее: " + seen;
    }
    public void eat(String food)
    {
        System.out.println("Человек съел еду - " + food);
        this.thought="съел еду - " + food;
    }
    public void sniff(String smell)
    {
        System.out.println("Человек услышал запах - " + smell);
        this.thought="услышал запах - " + smell;
    }
    public void hear(String sound)
    {
        System.out.println("Человек услышал звук - " + sound);
        this.thought="услышал звук - " + sound;
    }
    public void think()
    {
        System.out.println("Человек подумал о том, что он "+this.thought);
    }
    public void feel()
    {
        System.out.println("Человек почувствовал "+this.emotion);
    }
}
