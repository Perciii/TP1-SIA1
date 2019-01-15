package ex1;

import java.util.ArrayList;
import java.util.List;

public class ConcretePrice implements PriceObservable{

	private float price;
	private List<Observer> observers = new ArrayList<>();
	
	public ConcretePrice(float f) {
		price = f;
	}
	
	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notif() {
		for(Observer o : observers) {
			o.update();
		}
	}
	
	public float getPrice() {
		return price;
	}
	
}
