package ex4;

public class ColumnRights implements RightsHandler {

	private final String name;
	
	public ColumnRights(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean checkRights(Query q) {
		if(q.getA().getColumn().getName() == this.name) {
			return true;
		}
		return false;
	}
	
}
