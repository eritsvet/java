package ru.mirea.lab2;

public class Leg
{
    String place;
    public Leg()
    {
        this.place="где-то";
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public void go()
    {
        System.out.println("Место, куда пошел человек - "+ getPlace());
    }
    public void run()
    {
        System.out.println("Место, куда побежал человек - "+ getPlace());
    }
    public void stand()
    {
        System.out.println("Место, где стоял человек - "+ getPlace());
    }
}
