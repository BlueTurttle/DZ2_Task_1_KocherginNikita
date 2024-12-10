public class Tovar {
    private int quantity; //Количество товара
    private float price; //Цена товара
    private float discount; //Скидка на товар

    Tovar(int quantity, float price, float discount) { //Конструктор класса
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public void result() { //метод, который выполняет подсчеты
        String res1 = String.format("%.2f",quantity * price); //округление до двух знаков общей суммы товаров без скидки
        String res2 = String.format("%.2f",quantity * price * (100 - discount) / 100); //округление до двух знаков общей суммы товаров со скидкой
        System.out.println("Сумма покупки без скидки: " + res1); //вывод суммы товаров без скдки
        System.out.println("Сумма покупки со скидкой: " + res2); //вывод суммы товаров со скдкой
    }

}
