package ex4;

public class Chief implements User{
	private BaseRights rights;
	
	public Chief(BaseRights b) {
		rights = b;
	}
	
	@Override
	public Rights getRights() {
		return (Rights) rights;
	}
}
