package ex4;

public class Query {
	private Base base;
	private Table table;
	private Column column;
	private Authorisations a;
	
	public Query(Base b, Table t, Column c, User u) {
		base = b;
		table = t;
		column = c;
		a = u.getRights();
	}

	public Base getBase() {
		return base;
	}

	public Table getTable() {
		return table;
	}

	public Column getColumn() {
		return column;
	}
	
	public Authorisations getA() {
		return a;
	}

	public void setA(Authorisations a) {
		this.a = a;
	}

	public boolean send() {
		return ConcreteRightsHandler.checkRights(this);
	}
	
}
