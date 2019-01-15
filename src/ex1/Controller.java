package ex1;

import java.util.Objects;

public class Controller implements Observer {

	ConcretePrice price;
	float max;
	
	public Controller(ConcretePrice p, float threshold) {
		Objects.requireNonNull(p);
		price = p;
		max = threshold;
	}
	
	@Override
	public void update() {
		float p = price.getPrice();
		if(p >= max) {
			System.out.println("WARNING");
		}
	}
}
