import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    private int volue;

    public MagicBox(int volue) {
        this.volue = volue;
        this.items = (T[]) new Object[volue];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        int elements = 0;
        for (T e : items) {
            if (e == null) {
                elements++;
            }
        }
        if (elements != 0) {
            throw new RuntimeException("Коробка еще не полна, осталось заполнить " + elements + " элементов!");
        }
        return items[random()];
    }

    private int random() {
        Random random = new Random();
        int randomInt = random.nextInt(volue);
        return randomInt;
    }

}
