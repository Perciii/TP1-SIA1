package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConcretePrice implements PriceObservable{

	private float price;
	private List<Observer> observers = new ArrayList<>();
	
	public ConcretePrice(float f) {
		price = f;
	}
	
	@Override
	public void attach(Observer o) {
		Objects.requireNonNull(o);
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		Objects.requireNonNull(o);
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
