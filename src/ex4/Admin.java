package ex4;

public class Admin implements User {
	private GlobalRights rights;
	
	public Admin(GlobalRights r) {
		rights = r;
	}
	
	@Override
	public Rights getRights() {
		return (Rights) rights;
	}
}
