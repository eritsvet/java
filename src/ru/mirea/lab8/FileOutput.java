package ru.mirea.lab8;
import java.io.*;
import java.util.*;
public class FileOutput{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("C:/Users/dagni/Desktop/text.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null) System.out.println(line);
    }
}