package ru.mirea.pr7;
import java.lang.*;
import java.util.Stack;

public class GameStack
{
Stack<Integer> first, second;

public GameStack(String f, String s)
{
    this.first = new Stack<>();
    this.second = new Stack<>();
    for(int i = 0; i <=4; i++)
    {
        this.first.push(Integer.parseInt(f.substring(4-i, 5-i)));
        this.second.push(Integer.parseInt(s.substring(4-i,5-i)));
    }
}
    private void pushBack(Stack<Integer> s1, Integer card)
    {
        Stack<Integer> s2 = new Stack<>();
        while (!s1.isEmpty())
            s2.push(s1.pop());
        s1.push(card);
        while (!s2.isEmpty())
            s1.push(s2.pop());
    }
    public String play()
    {
        int k = 0;
        while(!first.isEmpty() && !second.isEmpty() && k <= 106){
            if(first.peek() > second.peek()
                    && second.peek() != 0){
                pushBack(first, first.pop());
                pushBack(first, second.pop());
            }else{
                pushBack(second, first.pop());
                pushBack(second, second.pop());
            }
            k++;
        }
        String res = "";
        if(first.isEmpty()) res += "second ";
        else res += "first ";
        res += k;
        if(k >= 106) res += " botva";
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new GameStack("13579", "24680").play());
        System.out.println(new GameStack("12345", "67890").play());
        System.out.println(new GameStack("13029", "42685").play());
    }
}
