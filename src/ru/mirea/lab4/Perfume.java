package ru.mirea.lab4;

public class Perfume extends Product
{
    private String firm, fragrance;
    private double volume;
    public Perfume(double price, String firm, String fragrance, double volume)
    {
        super(price);
        this.firm = firm;
        this.fragrance = fragrance;
        this.volume = volume;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getFirm() {
        return firm;
    }

    public void setFragrance(String fragrance) {
        this.fragrance = fragrance;
    }

    public String getFragrance() {
        return fragrance;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Духи: фирма - " + firm + ", аромат - " + fragrance + ", объем - " + volume + " мл, " + super.toString();
    }
}
