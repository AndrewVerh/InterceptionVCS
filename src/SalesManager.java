public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales [0];
        for (long sale : sales) {
            if (sale <= min) {
                min = sale;
            }
        }
        return min;
    }

    public long averageCuted() {
        int sumSales = 0;
        int sumIndx = 0;
        long avrCtd = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
            sumIndx ++;
        }
        sumIndx = sumIndx - 2;
        avrCtd = (sumSales - max() - min()) / sumIndx;
        return avrCtd;
    }
}
