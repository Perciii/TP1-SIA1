package ex4;

public class ColumnRights implements RightsHandler {
	private static String column = "c";
	
	public static boolean checkRights(Query q) {
		if(q.getA().getColumn() == column) {
			return true;
		}
		return false;
	}
	
}
