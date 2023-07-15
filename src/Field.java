import java.util.Arrays;

public class Field {
    Field() {

    }

    public static char[][] playerField = new char[11][11];
    public static char[][] enemyFieldMask = new char[11][11];
    public static char[][] enemyField = new char[11][11];

    public static void createField(char[][] array) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (j == 0 && i != 0) {
                    array[i][j] = (char) (i - 1 + '0');
                } else {
                    array[i][j] = '□';
                }
                if (j != 0 && i == 0) {
                    array[i][j] = (char) (j - 1 + '0');
                }
            }

        }
    }

    public static void printAll(char[][] array) {
        for (char[] a : array) {
            System.out.print(Arrays.toString(a) + "\n");
        }
        System.out.println();
    }

    public static void printField() {
        System.out.println("Поле противника");
        printAll(enemyFieldMask);
        System.out.println();
        System.out.println("Ваше поле");
        printAll(playerField);
    }
}
