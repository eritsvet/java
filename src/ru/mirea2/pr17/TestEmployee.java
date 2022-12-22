package ru.mirea2.pr17;

public class TestEmployee {
    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();
        retreiveDataFromDatabase(controller);
        controller.updateView();
    }

    public static void retreiveDataFromDatabase(EmployeeController controller){
        controller.setEmployeeHours(180);
        controller.setEmployeeHourPayment(850);
        controller.setEmployeeName("Ivan");
    }
}