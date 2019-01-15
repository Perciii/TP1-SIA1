
public class Calculator implements Visitor {

	public int calculate(Node n) {
		return n.value();
	}
	
}
