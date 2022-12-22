package ru.mirea2.pr3.formoutputstr;

import java.util.Scanner;

class Converter{
    String[] currencyList = {"RUB", "USD", "EUR"};
    Scanner s = new Scanner(System.in);
    double[][] convertTable = {
            {1.0, 0.0166, 0.016},
            {60.4, 1.0, 0.964},
            {62.64, 1.037, 1.0}
    };

    public Converter(){}

    public void Execute(){
        int chooseStartCurrency = -1;

        do{
            System.out.println("0 - Конец работы конвертора");
            for(int i =0; i < currencyList.length; i++)
                System.out.println(i + 1 +" - "+ currencyList[i]);
            System.out.print("Выберите стартовую валюту: ");

            do {
                chooseStartCurrency = s.nextInt();
                if(chooseStartCurrency < 0 || chooseStartCurrency > 3) System.out.println("Неверный номер валюты, повторите ввод: ");
            } while(chooseStartCurrency < 0 || chooseStartCurrency > 3);

            if (chooseStartCurrency != 0)
            {
                System.out.println("Сколько Вы хотели бы конвертировать:"  );
                double startAmount = (double) s.nextInt();

                convertCurrency(chooseStartCurrency - 1, startAmount);
            }

        }while (chooseStartCurrency != 0);

        System.out.println("Конец работы конвертора");
    }

    public void convertCurrency(int startCurrencyNum, double startAmount){
        int chooseEndCurrency = -1;

        for(int i =0; i < currencyList.length; i++) {
            if (i != startCurrencyNum) System.out.println(i + 1 +" - "+ currencyList[i]);
        }
        System.out.println("Выберите итоговую валюту: ");

        do {
            chooseEndCurrency = s.nextInt();
            if(chooseEndCurrency < 0 || chooseEndCurrency > 3 || chooseEndCurrency == startCurrencyNum)
                System.out.println("Неверный номер валюты, повторите ввод: ");
        } while(chooseEndCurrency < 0 || chooseEndCurrency > 3 || chooseEndCurrency == startCurrencyNum);


        chooseEndCurrency--;

        double endAmount = startAmount * convertTable[startCurrencyNum][chooseEndCurrency];
        System.out.println(startAmount + " " + currencyList[startCurrencyNum] + " = " + endAmount + " " + currencyList[chooseEndCurrency]);
    }

    public static void main(String[] args) {
        Converter convertor = new Converter();
        convertor.Execute();
    }

}