public class Main {
    public static void main(String[] args) {

        MagicBox<String> boxString = new MagicBox<>(5);
        MagicBox<Integer> boxInteger = new MagicBox<>(4);
        MagicBox<String> boxError = new MagicBox<>(2);

        boxString.add("Строка 1");
        boxString.add("Строка 2");
        boxString.add("Строка 3");
        boxString.add("Строка 4");
        boxString.add("Строка 5");

        String boxMagic = boxString.pick();
        System.out.println(boxMagic);

        boxInteger.add(1);
        boxInteger.add(2);
        boxInteger.add(3);
        boxInteger.add(4);

        int boxNumber = boxInteger.pick();
        System.out.println(boxNumber);
        boxError.add("Ошибка! Error!");
        boxError.pick();
    }

}