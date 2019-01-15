package ex4;

public class Chief implements User{
	private Authorisations rights;
	
	public Chief(Base b) {
		Authorisations r = new Authorisations();
		r.setBaser(true);
		r.setBase(b);
		rights = r;
	}
	
	@Override
	public Authorisations getRights() {
		return (Authorisations) rights;
	}
}
