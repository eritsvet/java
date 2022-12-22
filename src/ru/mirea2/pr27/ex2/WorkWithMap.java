package ru.mirea2.pr27.ex2;

import java.util.*;

public class WorkWithMap {
    Map<String, ArrayList<String>> map;


    WorkWithMap(){
        map = new HashMap<String, ArrayList<String>>();
    }

    public void addValues(String key, String value) {
        ArrayList tempList = null;
        if (map.containsKey(key)) {
            tempList = map.get(key);
            if(tempList == null)
                tempList = new ArrayList();
            tempList.add(value);
        } else {
            tempList = new ArrayList();
            tempList.add(value);
        }
        map.put(key,tempList);
    }


    public HashMap<String, ArrayList<String>> createMap(){
        return (HashMap<String, ArrayList<String>>) map;
    }

    public int getSameFirstNameCount(){

        int count = 0;

        for(Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            if (item.getValue().size() > 1) count++;
        }

        return count;
    }

    public int getSameLastNameCount(){
        Map<String, Integer> tmp = new HashMap<>();

        for(Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            for (String name : item.getValue()) {
                if (tmp.containsKey(name)) tmp.replace(name, tmp.get(name) + 1);
                else tmp.put(name, 1);
            }
        }

        int count = 0;

        for(Map.Entry<String, Integer> item : tmp.entrySet()){
            if (item.getValue() > 1) count++;
        }
        return count;
    }


}
