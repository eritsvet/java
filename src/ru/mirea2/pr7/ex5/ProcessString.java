package ru.mirea2.pr7.ex5;

public class ProcessString implements StringWork{
    String s;
    ProcessString(String s){
        this.s = s;
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }

    @Override
    public int getLen() {
        return s.length();
    }

    @Override
    public String getOddChar() {
        String s1 = "";
        for(int i = 0; i < getLen(); i++){
            if (i % 2 == 1) s1 += s.charAt(i);
        }
        return s1;
    }

    @Override
    public String reverse() {
        String s1 = "";
        for(int i = getLen() - 1; i >= 0; i--){
            s1 += s.charAt(i);
        }
        return s1;
    }
}
