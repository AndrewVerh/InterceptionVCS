public class Main {
    public static void main(String[] args) {
        SalesManager Olya = new SalesManager(new long[]{3, 5, 8}); //оля совершила за раб день 3 сделки на 3, 5 и 8$
        System.out.println(Olya.max()); //покажи самую прибыльную продажу Оли
    }
}
