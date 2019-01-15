package ex1;

public class Consumer implements Observer {
 
	ConcretePrice price;
	float max;
	
	public Consumer(ConcretePrice p, float threshold) {
		price = p;
		max = threshold;
	}
	
	@Override
	public void update() {
		float p = price.getPrice();
		if(p <= max) {
			System.out.println("Bought");
		}
	}

}
