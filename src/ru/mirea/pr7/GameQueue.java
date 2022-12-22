package ru.mirea.pr7;
import java.lang.*;
import java.util.Queue;
import java.util.ArrayDeque;

public class GameQueue
{
    Queue<Integer> first, second;
    public GameQueue(String fp, String sp) {
        this.first = new ArrayDeque<>();
        this.second = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.first.add(Integer.parseInt(fp.substring(i, i+1)));
            this.second.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!first.isEmpty() && !second.isEmpty() && count < 106){
            if(first.peek() > second.peek()
                    && second.peek() != 0){
                first.add(first.remove());
                first.add(second.remove());

            }else{
                second.add(first.remove());
                second.add(second.remove());
            }
            count++;
        }
        String res = "";
        if(first.isEmpty()) res += "second ";
        else if (second.isEmpty()) res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new GameQueue("13579", "24680").play());
        System.out.println(new GameQueue("12345", "67890").play());
        System.out.println(new GameQueue("13029", "42685").play());
    }
}
