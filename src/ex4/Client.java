package ex4;

public class Client implements User {
	private Authorisations rights;
	
	public Client(Base b, Table t, Column c) {
		Authorisations cr = new Authorisations();
		cr.setBase(b);
		cr.setTable(t);
		cr.setColumn(c);
		rights = cr;
	}
	
	@Override
	public Authorisations getRights() {
		return (Authorisations) rights;
	}
}
