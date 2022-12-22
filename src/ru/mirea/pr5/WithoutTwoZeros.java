package ru.mirea.pr5;
import java.math.*;
import java.util.Scanner;
//Вариант 9
/*
Если все единицы:
f(0, b) = 1
Если один ноль, остальные единицы:
f(1, b) = b + 1
Если больше одного нуля и нет единиц:
f(>1, 0) = 0
Иначе либо последняя цифра - ноль, тогда предпоследняя - единица; либо последняя - единица.
f(a, b) = f(a - 1, b - 1) + f(a, b - 1)
 */
public class WithoutTwoZeros
{
    public static int count(int a, int b)
    {
        if (a==0) return 1;
        if (a==1) return b+1;
        if (a>1 && b == 0) return 0;
        return count(a-1,b-1)+count(a,b-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число нулей:");
        int a = s.nextInt();
        System.out.println("Введите число единиц:");
        int b = s.nextInt();
        System.out.println("Количество последовательностей, в которых никакие два нуля не стоят рядом: " + count(a,b));
    }
}
