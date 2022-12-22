package ru.mirea2.pr6.ex10;

public enum ComputerNames {
    TOP("SuperComputerHighPrice"),
    MIDDLE("GoodComputerNormalPrice"),
    LOW("SlowComputerCheap");

    private String title;

    ComputerNames(String title) {
        this.title = title;
    }

    public String getStTitle() {
        return title;
    }

    public void setStTitle(String stTitle) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ComputerNames{" +
                "Title='" + title + '\'' +
                '}';
    }
}