import java.util.Scanner;

public class Ship {
    Ship() {

    }

    /**
     * создание всех кораблей
     * проблема с методом пороверки соседних кораблей
     * @return
     */

    public static boolean horizontal;
    public static int[] ships = new int[]{4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
    public static void horizontalOrVertical() {
        System.out.println("Как хотите расположить корабль?");
        System.out.println("1: Горизонтально");
        System.out.println("2: Вертекально");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1 -> horizontal = true;
            case 2 -> horizontal = false;
            default -> System.out.println("Неверный пункт");
        }
    }

    public static void createShip(int ij, int shipLength, char[][] array) {
        int i = ij / 10;
        int j = ij % 10;
        int v = i + 2;
        int h = j + 2;
        if (horizontal) {
            h = h + shipLength - 1;
        } else {
            v = v + shipLength - 1;
        }
        for (int a = i + 1; a < v; a++) {
            for (int b = j + 1; b < h; b++) {
                array[a][b] = '■';
            }
        }
    }

    public static void freeCell(int ij, char[][] array, int shipLength) {
        int i = ij / 10;
        int j = ij % 10;
        int v = i + 2;
        int h = j + 2;
        horizontalOrVertical();
        if (horizontal) {
            h = h + shipLength - 1;
            if (h > 11) {
                System.out.println("Не верное расположение корабля");
            }
        } else {
            v = v + shipLength - 1;
            if (v > 11) {
                System.out.println("Не верное расположение корабля");
            }
        }

        for (int a = i + 1; a < v; a++) {
            for (int b = j + 1; b < h; b++) {
                if (array[a - 1][b] == '■'
                        || array[a + 1][b] == '■'
                        || array[a][b - 1] == '■'
                        || array[a][b + 1] == '■'
                        || array[a + 1][b + 1] == '■'
                        || array[a - 1][b - 1] == '■'
                        || array[a - 1][b + 1] == '■'
                        || array[a + 1][b - 1] == '■') {
                    System.out.println("Введите другие координаты");
                    break;
                } else {
                    createShip(ij, shipLength, array);
                }
            }
        }
    }

    public static void placementShips(char[][] array) {
        for (int ship : ships) {
            System.out.println("Введите координаты корабля");
            freeCell(scanner.nextInt(), array, ship);
            Field.printField();
        }
    }

    public static Scanner scanner = new Scanner(System.in);
}
