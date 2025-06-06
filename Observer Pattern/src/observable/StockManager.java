package observable;

import observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public interface StockManager {
    void addObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObserver();
}
