public class Main {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox<>(4);
        magicBox.add(2);
        magicBox.add(true);
        magicBox.add("Текст");
        magicBox.add(3);
        magicBox.add("Текст2");
        System.out.println("Случайный выбор в коробке: " + magicBox.pick());

        MagicBox magicBox1 = new MagicBox<>(5);
        magicBox1.add(1);
        magicBox1.add(2);
        System.out.println(magicBox1.pick());
    }
}