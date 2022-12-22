package ru.mirea2.pr26;

public class TestHashTable {

    public static void main(String[] args){
        HashTable tab = new HashTable();
        tab.hashtabInit();
        tab.hashtabAdd(10,"a");
        tab.hashtabAdd(15,"b");
        tab.hashtabAdd(8,"c");
        tab.hashtabAdd(3,"d");
        tab.hashtabAdd(16,"e");
        tab.hashtabAdd(2,"f");
        tab.hashtabAdd(4,"g");
        tab.hashtabAdd(1,"h");
        tab.hashtabAdd(25,"i");
        tab.hashtabAdd(5,"j");
        System.out.println(tab.hashtabLookUp(10));
        System.out.println(tab.hashtabLookUp(25));
        System.out.println(tab.hashtabLookUp(8));


    }

}