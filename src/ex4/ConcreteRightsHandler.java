package ex4;

public class ConcreteRightsHandler implements RightsHandler{

	public static boolean checkRights(Query q) {
		return Global.checkRights(q);
	}

}
