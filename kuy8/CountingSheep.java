package Task_CodeWars_Java.kuy8;

public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        try {
            for(Boolean item: arrayOfSheeps) {
                if (item == true) {
                    count++;
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return count;
    }
}
