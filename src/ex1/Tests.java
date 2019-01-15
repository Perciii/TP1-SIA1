package ex1;

import org.junit.Test;

public class Tests {

	@Test
	public void main() {
		ConcretePrice c1 = new ConcretePrice(10f);
		
		Controller con = new Controller(c1, 9f);
		Consumer mer = new Consumer(c1, 11f);
		c1.attach(con);
		c1.attach(mer);
		c1.notif();
	}
	
}
