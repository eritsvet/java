package ru.mirea2.pr6.ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k = -1;
        Scanner s = new Scanner(System.in);
        Shop newShop = new Shop(5);
        System.out.println(newShop);
        do{
            System.out.println("Введите число: \n0 - Завершение работы " +
                    "\n1 - Добавление компьютера в магазин " +
                    "\n2 - Удаление компьютера из магазина" +
                    "\n3 - Поиск в магазине компьютера");
            do{
               k = s.nextInt();
               if (k<0 || k>3) System.out.println("Введено неверное число");
            }while (k<0 || k>3);
            if (k>=1 & k<=3) {
                switch (k) {
                    case 1: {
                        newShop.addComputers(new Computer(ComputerNames.TOP,new Memory("very good",500000, 4096), new Monitor("the best",720,720), new Processor("the worst",5000,6,12),200000));
                        System.out.println("Компьютер добавлен");
                        System.out.println(newShop);
                        break;
                    }
                    case 2: {
                        System.out.println("Введите номер компьютера, который необходимо удалить:");
                        int n;
                        n = s.nextInt();
                        newShop.removeComputer(n);
                        System.out.println("Компьютер удален");
                        System.out.println(newShop);
                        break;
                    }
                    case 3: {
                        System.out.println("Введите число: \n1 - SuperComputerHighPrice " +
                                "\n2 - GoodComputerNormalPrice" +
                                "\n3 - SlowComputerCheap");
                        int n;
                        n = s.nextInt();
                        if (n==1) System.out.println("Компьютер найден: " + newShop.findComputer(ComputerNames.TOP.getStTitle()));
                        if (n==2) System.out.println("Компьютер найден: " + newShop.findComputer(ComputerNames.MIDDLE.getStTitle()));
                        if (n==3) System.out.println("Компьютер найден: " + newShop.findComputer(ComputerNames.LOW.getStTitle()));
                    }
                }
            }
        }while (k != 0);
        System.out.println(newShop);
    }
}