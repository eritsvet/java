package ru.mirea2.pr6.ex6_7_8_9;

public class Shop implements Printable{

    private String name;
    private String category;

    public Shop(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public void print(){
        System.out.println("\nMagazine: " + name + "\nCategory: " + category);
    }
}
