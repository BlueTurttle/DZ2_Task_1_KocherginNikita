public class Main {
    public static void main(String[] args) {
        Tovar a = new Tovar(5, 1000, 0.75f); //создание объекта a класса Tovar
        Tovar b = new Tovar(3, 50, 42.575f); //создание объекта b класса Tovar
        Tovar c = new Tovar(8, 350, 59.1f); //создание объекта c класса Tovar
        a.result(); //вызов метода, который выполняет подсчеты для объекта а
        b.result(); //вызов метода, который выполняет подсчеты для объекта b
        c.result(); //вызов метода, который выполняет подсчеты для объекта c
    }
}