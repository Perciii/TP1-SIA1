package ex4;

public class ConcreteRightsHandler implements RightsHandler{

	@Override
	public boolean checkRights(Query q) {
		//if(q.getUser().getRights())
		return false;
	}

}
