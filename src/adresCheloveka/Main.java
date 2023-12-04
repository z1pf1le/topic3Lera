package adresCheloveka;

public class Main{
    public static void main(String[] args) {
        Adress adress1 = new Adress(1, "Vladimir", "Lenina", 2);
        Adress adress2 = new Adress(2, "Suzdal", "Pushkina", 3);
        Adress adress3 = new Adress(3, "Pokrov", "Lermontova", 42);
        Adress adress4 = new Adress(4, "Moscow", "Shevchenko", 24);

        Human human1 = new Human("Ivan", "Petrov", 1989, adress1);
        Human human2 = new Human("Petr", "Ivanov", 1988, adress2);
        Human human3 = new Human("Maria", "Petrenko", 1990, adress3);
        Human human4 = new Human("Ad", "Gain", 1991, adress4);
    }
}
