package ex4;

public class Admin implements User {
	private Authorisations rights;
	
	public Admin(Authorisations r) {
		rights = r;
	}
	
	@Override
	public Authorisations getRights() {
		return (Authorisations) rights;
	}
}
