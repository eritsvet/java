package ru.mirea2.pr3.formoutputstr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineStore {

    Map<String, Integer> mapStoreList = new HashMap<>();
    String[] Goods = {"Футболки", "Рубашки", "Толстовки", "Верхняя одежда"};

    OnlineStore(){
        mapStoreList.put("Футболки", 1000);
        mapStoreList.put("Рубашки", 2000);
        mapStoreList.put("Толстовки", 2500);
        mapStoreList.put("Верхняя одежда",5000);
    }

    public void execute(){
        do {
            System.out.println("\n0 - Выход");
            for(int i =0; i < Goods.length; i++)
                System.out.println(i + 1 +" - "+ Goods[i]);
            System.out.println("Введите номер товара: ");
            Scanner s = new Scanner(System.in);
            Integer iChosenGood = 0;
            iChosenGood = s.nextInt();
            while ((iChosenGood < 1 || iChosenGood > 4) && iChosenGood != 0) {
                System.out.println("Неверный номер товара, повторите ввод: ");
                iChosenGood = s.nextInt();
            }

            if(iChosenGood == 0) break;
            iChosenGood--;
            System.out.println("Цена товара: ");
            Converter convertor = new Converter();
            convertor.convertCurrency(0, mapStoreList.get(Goods[iChosenGood]));


        } while(true);

    }

    public static void main(String[] args) {
        new OnlineStore().execute();
    }

}
