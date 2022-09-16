package papka;

import java.util.SortedMap;

public class Cat {
    String name;
    int age;
    String aGe;
    String status;
    String color;
    static int amount = 0; //Всіх
    static int amountB = 0; //бездомних;
    String information;

    public Cat(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.status = "Домашній";
        this.information = ("Ім'я: " + name + "; Вік: " + age + "; Колір: " + color + "; Статус: " + status + ".");

    }

    public Cat(String color) {
        this.color = color;
        amountB++;
        this.name = ("Бездомний кіт номер : " + amountB);
        this.status = "Бездомний";
    }
    @Override
    public String toString() {
        return "Ім'я: " + name + "; Вік: " + ((age == 0) ? "Невідомо" : age) + "; Колір: " + color + "; Статус: " + status + ".";
    }
    public static void main(String[] args) {
        Cat StreetCat_1 = new Cat("Black_white");
        amount++;
        Cat StreetCat_2 = new Cat("Brown");
        amount++;
        Cat siga = new Cat(5, "Вася", "Black");
        amount++;
        Cat dimon = new Cat(2, "Дімон", "White");
        amount++;
        System.out.println("Кількість котів : " + amount);
        System.out.println("Кількість бездомних котів : " + amountB);
        System.out.println(StreetCat_1);
    }
}

