package ru.mirea2.pr20.ex1_2_3;

public class TestAnimal {
    public static void main(String[] args) {
        ThreeClasses<Integer, String, AnimalNext> tmp = new ThreeClasses<>(5, "tmp", new AnimalNext(5,"tmp",10));
        tmp.showClassesName();
    }
}
