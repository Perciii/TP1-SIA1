package ex3;

import org.junit.Test;

public class EmployeTest {

	@Test
	public void main() {
		Employe e = new Employe(1000, "René");
		DecideurConcret d2 = new DecideurConcret(10000);
		DecideurConcret d1 = new DecideurConcret(5000, d2);
		e.ajouteDecideur(d1);
		System.out.println(e.accordDepense(6000));
	}
	
}
