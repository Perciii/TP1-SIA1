package ex4;

public class Global implements RightsHandler {

	public static boolean checkRights(Query q) {
		if(q.getA().isGlobal()) {
			return true;
		}
		return q.getBase().checkRights(q);
	}


}
