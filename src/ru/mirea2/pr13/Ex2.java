package ru.mirea2.pr13;

public class Ex2 {

    static class Person{
        String Surname = "";
        String Name = " ";
        String Patronymic = " ";

        public Person(String surname, String name, String patronymic) {
            Surname = surname;
            Name = name;
            Patronymic = patronymic;
        }

        public Person(String surname, String name) {
            Surname = surname;
            Name = name;
        }

        public Person(String surname){
            Surname = surname;
        }

        public void showInfo(){
            System.out.println(Surname + " " + Name.charAt(0) + " " + Patronymic.charAt(0));
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Иванов", "Иван" , "Иванович");
        person.showInfo();

        Person secondPerson = new Person("Иванов", "Иван");
        secondPerson.showInfo();

        Person thirdPerson = new Person("Иванов");
        thirdPerson.showInfo();
    }

}
