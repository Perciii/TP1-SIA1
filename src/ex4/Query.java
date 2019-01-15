package ex4;

public class Query {
	private String base;
	private String table;
	private String column;
	private Authorisations a;
	
	public Query(String b, String t, String c, User u) {
		base = b;
		table = t;
		column = c;
		a = u.getRights();
	}

	public String getBase() {
		return base;
	}

	public String getTable() {
		return table;
	}

	public String getColumn() {
		return column;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public void setColumn(String column) {
		this.column = column;
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
