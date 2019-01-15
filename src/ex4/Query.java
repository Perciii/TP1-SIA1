package ex4;

public class Query {
	private BaseRights base;
	private TableRights table;
	private ColumnRights column;
	private Authorisations a;
	
	public Query(BaseRights b, TableRights t, ColumnRights c, User u) {
		base = b;
		table = t;
		column = c;
		a = u.getRights();
	}

	public BaseRights getBase() {
		return base;
	}

	public TableRights getTable() {
		return table;
	}

	public ColumnRights getColumn() {
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
