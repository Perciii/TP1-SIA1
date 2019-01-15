package ex3;

import java.util.Objects;

public class DecideurConcret implements Decideur {

	private DecideurConcret superieur;
	final int plafond;
	
	public DecideurConcret(int p) {
		plafond = p;
	}
	
	public DecideurConcret(int p, DecideurConcret s) {
		Objects.requireNonNull(s);
		plafond = p;
		superieur = s;
	}
	
	@Override
	public boolean accord(int m) {
		if(m <= plafond) {
			System.out.println("ok");
			return true;
		}
		if(superieur == null) {
			return false;
		}
		return superieur.accord(m);
	}

}
