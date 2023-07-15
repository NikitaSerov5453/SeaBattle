import java.util.Objects;
import java.util.Scanner;

public class WorkingWithField { // ■ □
    WorkingWithField() {

    }

    public static void placementShips() {
        System.out.println("Разместите корабли:");
        System.out.println("**** x " + 1);
        System.out.println("***  x " + 2);
        System.out.println("**   x " + 3);
        System.out.println("*    x " + 4);


    }


    public static int getIndex(String[] chars, char search) { //поиск индекса заданного символа
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < chars.length; i++) {
            if (Objects.equals(chars[i], String.valueOf(search))) {
                if (i < index) {
                    index = i;
                }
            }
        }
        if (index > chars.length) {
            index = -1;
        }
        return index;
    }
}
