package observable;

import observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class StockManagerHandler implements StockManager{
    List<StockObserver> mObservers = new ArrayList<>();
    int stocks=0;
    @Override
    public void addObserver(StockObserver observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        mObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(StockObserver observer: mObservers){
            observer.observe();
        }
    }

    public void setStocks(int stocks) {
        if(this.stocks==0)
            notifyObserver();
        this.stocks=stocks;
    }
}
