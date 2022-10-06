import java.util.Random;

public class MagicBox<T> {
    public T[] items;

    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println(item + " не добавлено. Места заполнены.");
        return false;
    }

    T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Данная коробка не полна, осталось заполнить " + (items.length - i) + " ячейки");
            }
        }

        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];

    }
}