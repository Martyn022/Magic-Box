public class Main {
    public static void main(String[] args) {

        MagicBox<String> boxString = new MagicBox<>(5);
        MagicBox<Integer> boxInteger = new MagicBox<>(4);
        MagicBox<String> boxError = new MagicBox<>(2);

        boxString.add("1.Синяя");
        boxString.add("2.Красная");
        boxString.add("3.Желтая");
        boxString.add("4.Зеленая");
        boxString.add("5.Коричневая");

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