
public class Main {
	public static void main(String[] args) {
		NodeValue n1 = new NodeValue(2);
		NodeValue n2 = new NodeValue(2);
		NodeValue n3 = new NodeValue(2);
		NodeMinus n4 = new NodeMinus(n3, n2);
		NodePlus n5 = new NodePlus(n1, n4);
		
		Calculator c = new Calculator();
		System.out.println(n5.accept(c));
		System.out.println(n4.accept(c));
		
	}
}
