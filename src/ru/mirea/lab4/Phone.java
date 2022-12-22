package ru.mirea.lab4;

public class Phone extends Product
{
    private String model;
    public Phone(double price, String model)
    {
        super(price);
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Телефон: модель - " + model + ", " + super.toString();
    }
}
