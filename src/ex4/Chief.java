package ex4;

public class Chief implements User{
	private Authorisations rights;
	
	public Chief(Authorisations b) {
		rights = b;
	}
	
	@Override
	public Authorisations getRights() {
		return (Authorisations) rights;
	}
}
