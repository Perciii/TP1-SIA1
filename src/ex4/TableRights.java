package ex4;

public class TableRights implements RightsHandler {
	private static String table = "t"; 
	
	
	public static boolean checkRights(Query q) {
		if(q.getA().getTable() == table) {
			return ColumnRights.checkRights(q);
		}
		return false;
	}
	
}
