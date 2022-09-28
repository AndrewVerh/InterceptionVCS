public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = 0;
        for (int sale : sales) {
            if (sale <= min) {
                min = sale;
            }
        }
        return min;
    }

    public int averageCuted() {
        int sumSales = 0;
        int sumIndx = 0;
        int avrCtd = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
            sumIndx ++;
        }
        sumIndx = sumIndx - 2;
        avrCtd = (sumSales - max() - min()) / sumIndx;
        return avrCtd;
    }
}
