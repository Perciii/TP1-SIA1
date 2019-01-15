package ex4;

public class BaseRights implements RightsHandler{
	private static String base = "b";

	public static boolean checkRights(Query q) {
		if(q.getA().isBaser()) {
			return true;
		}
		if(q.getA().getBase() == base) {
			return TableRights.checkRights(q);
		}
		return false;
	}
	
}
