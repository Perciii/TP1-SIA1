package ex1;

public interface PriceObservable {
	public void attach(Observer o);
	public void detach(Observer o);
	public void notif();
	
}
