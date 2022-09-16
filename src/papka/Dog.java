package papka;

public class Dog {
    String name;
    int age;
    String aGe;
    String status;
    String color;
    static int amountDog = 0; //Всіх
    static int amountDogB = 0; //бездомних;
    public Dog(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.status = "Домашній";
    }
    public Dog(String color) {
        this.color = color;
        amountDogB++;
        this.name = "Бездомний пес номер : " + amountDogB;
        this.status = "Бездомний";
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + "; Вік: " + ((age == 0) ? "Невідомо" : age) + "; Колір: " + color + "; Статус: " + status + ".";
    }
    public static void main(String[] args) {
        Dog StreetDog_1 = new Dog("REd");
        amountDog++;
        Dog StreetDog_2 = new Dog("Brown");
        amountDog++;
        Dog jeck = new Dog(5, "Джек", "Black");
        amountDog++;
        Dog sharik = new Dog(2, "Шарік", "Black");
        amountDog++;
        System.out.println("Кількість собак : " + amountDog);
        System.out.println("Кількість бездомних собак : " + amountDogB);
        System.out.println(StreetDog_2);
    }
}

