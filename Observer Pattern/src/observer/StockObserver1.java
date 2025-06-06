package observer;

import observable.StockManager;

public class StockObserver1 implements StockObserver {
    StockManager st;
    public StockObserver1(StockManager manager){
        this.st = manager;
    }
    public void init(){
        st.addObserver(this);
    }
    public void observe(){
        System.out.println("Something got changed in the observable and observed in observer1");
    }
}
