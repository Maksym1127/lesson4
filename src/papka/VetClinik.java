package papka;

import java.util.Arrays;

public class VetClinik {
    public static void main(String[] args) {
        String ClinikName = "Звірятко";
        String[] Cat = {"StreetCat_1", "StreetCat_2", "siga", "dimon"};
        String[] Dog = {"StreetDog_1", "StreetDog_2", "jeck", "sharik"};
        System.out.println("Коти: " + Arrays.toString(Cat));
        System.out.println("Собакі: " + Arrays.toString(Dog));
        System.out.println("Котів :" + Cat.length);
        System.out.println("Собак :" + Dog.length);
    }
}
