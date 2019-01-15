package ex4;

public class Client implements User {
	private Authorisations rights;
	
	public Client(Authorisations cr) {
		rights = cr;
	}
	
	@Override
	public Authorisations getRights() {
		return (Authorisations) rights;
	}
}
