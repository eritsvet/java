package ru.mirea2.pr21.ex2_3;

public class ArrayStorage<E>{

    private E[] array;

    public E get(int index){
        return array[index];
    }

    public void setArray(E[] array){
        this.array = array;
    }

}