package ru.mirea2.pr14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class main {

    public static void main(String[] args) {
        System.out.println(secondTask("abcdefghijklmnopqrstuv18340"));
        System.out.println(thirdTask("44 ERR"));
        System.out.println(fourthTask("(1 + 8) – 9 / 4"));
        System.out.println(sixthTask("@my.ru"));
        eighthTask(new String[]{"first", "second", "empty"});
    }

    public static boolean secondTask(String stTaskTwo){
        return stTaskTwo.matches("abcdefghijklmnopqrstuv18340");
    }

    public static boolean thirdTask(String stTaskThree){
        return stTaskThree.matches("^[0-9]{1,}.[0-9]{1,2}\\s(USD|RUB|EU)");
    }


    public static boolean fourthTask(String stTaskFour){
        return stTaskFour.matches(".*(\\+)\\s*[0-9]{1,}.*");
    }

    public static boolean sixthTask(String stTaskSix){
        return stTaskSix.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)(()|(\\.([a-zA-Z]{2,5})))$");
    }

    public static void eighthTask(String[] array){
        String[] newArray = (String[])filter(array, new Filter(){
            @Override
            public boolean apply(Object o ){
                return !o.equals("empty");
            }
        });

        System.out.println(Arrays.toString(newArray));
    }

    public static Object[] filter(Object[] array, Filter filter) {
        int iDeletedCount = 0;
        for(int i = 0; i< array.length; i++){
            if(!filter.apply(array[i])){
                iDeletedCount++;
            } else{
                array[i - iDeletedCount] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - iDeletedCount);
    }

    interface Filter {
        boolean apply(Object o);
    }

}