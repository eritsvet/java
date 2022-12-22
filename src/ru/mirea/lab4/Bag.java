package ru.mirea.lab4;

public class Bag extends Product
{
    private String firm, model;
    public Bag(double price, String firm, String model)
    {
        super(price);
        this.firm = firm;
        this.model = model;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getFirm() {
        return firm;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Сумка: фирма - " + firm + ", модель - " + model + ", " + super.toString();
    }
}
