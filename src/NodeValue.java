
public class NodeValue implements Node {
	private int value;
	
	public NodeValue(int v) {
		value = v;
	}
	@Override
	public int value() {
		return value;
	}
	@Override
	public int accept(Visitor v) {
		return v.calculate(this);		
	}
}
