package ex4;

public class Client implements User {
	private ColumnRights rights;
	
	public Client(ColumnRights cr) {
		rights = cr;
	}
	
	@Override
	public Rights getRights() {
		return (Rights) rights;
	}
}
