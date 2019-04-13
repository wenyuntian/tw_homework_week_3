package practice11;

public interface Observerable {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
