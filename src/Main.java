public class Main {
    public static void main(String[] args) {
        SalesManager Olya = new SalesManager(new int[]{4, 0, 8, 10}); //оля совершила за раб день 4 сделки на 3...19$
        System.out.println(Olya.max()); //покажи самую прибыльную продажу Оли
        System.out.println(Olya.min()); //самая убыточная продажа Оли
        System.out.println(Olya.averageCuted());
    }
}
