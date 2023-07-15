
public class Main {
    public static void main(String[] args) {
//        Ship ship = new Ship();
        Field.createField(Field.playerField);
        Field.createField(Field.enemyFieldMask);
        Field.printField();
        Ship.placementShips(Field.playerField);
        Field.printField();

    }
}