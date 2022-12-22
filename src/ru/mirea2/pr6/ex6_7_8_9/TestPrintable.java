package ru.mirea2.pr6.ex6_7_8_9;

public class TestPrintable
{
    public static void main(String[] args) {
        Book b1 = new Book("Shakespeare", "1597", "Romeo and Juliet" );
        Book b2 = new Book("Tolstoy", "1867", "War and Piece");
        Shop sh1 = new Shop("Vogue", "Fashion");
        Shop sh2 = new Shop("National Geographic", "Animals");

        Printable[] p = {b1,b2,sh1,sh2};

        for(Printable printable : p){
            printable.print();
        }
    }
}
