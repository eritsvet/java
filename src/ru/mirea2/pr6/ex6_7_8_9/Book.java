package ru.mirea2.pr6.ex6_7_8_9;

public class Book implements Printable{

    private String author;
    private String date;
    private String title;

    public Book(String author, String date, String title) {
        this.author = author;
        this.date = date;
        this.title = title;
    }

    @Override
    public void print(){
        System.out.println("\nBook:\nAuthor: " + author + "\nDate: " + date + "\nTitle: " + title);
    }

}
