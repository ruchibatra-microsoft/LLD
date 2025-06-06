import observable.StockManager;
import observable.StockManagerHandler;
import observer.StockObserver1;
import observer.StockObserver2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StockManagerHandler manager = new StockManagerHandler();
        StockObserver1 st1 = new StockObserver1(manager);
        StockObserver2 st2 = new StockObserver2(manager);
        st1.init();
        st2.init();
        manager.setStocks(10);
    }
}