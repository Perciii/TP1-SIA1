
public class NodePlus implements Node {
	private Node left;
	private Node right;
	
	public NodePlus(Node l, Node r) {
		left = l;
		right = r;
	}
	
	@Override
	public int value() {
		return left.value() + right.value();
	}
	@Override
	public int accept(Visitor v) {
		return v.calculate(this);
	}
}
