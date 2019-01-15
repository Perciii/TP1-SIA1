package ex1;

public class Controller implements Observer {

	ConcretePrice price;
	float max;
	
	public Controller(ConcretePrice p, float threshold) {
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
