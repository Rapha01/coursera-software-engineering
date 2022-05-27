public class Channel extends Subject {
  private ArrayList<Observer> observers = new ArrayList<Observer>();
  private String channelName;
  private String status;

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void notifyObservers() {
    for (Observer o : observers) {
      o.update(this.status);
    }
  }

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }
}
