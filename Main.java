package Task_CodeWars_Java;

import Task_CodeWars_Java.kuy8.CountingSheep;

public class Main {
    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        CountingSheep countingSheep = new CountingSheep();
        System.out.println(countingSheep.countSheeps(array1));
    }
}
