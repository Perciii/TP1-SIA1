package ex4;

public class Query {
	private String base;
	private String table;
	private String column;
	private User user;
	
	public Query(String b, String t, String c, User u) {
		base = b;
		table = t;
		column = c;
		user = u;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public boolean send() {
		RightsHandler rh = new ConcreteRightsHandler();
		return rh.checkRights(this);
	}
	
}
