package ex4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class SmallTester {

	@Test
	public void main() {
		BaseRights b = new BaseRights("Simple", new ArrayList<TableRights>());
		TableRights t = new TableRights("Alphabet", new ArrayList<ColumnRights>());
		ColumnRights c1 = new ColumnRights("A");
		ColumnRights c2 = new ColumnRights("B");
		t.addColumns(c1);
		t.addColumns(c2);
		b.addTable(t);
		
		Admin a = new Admin();
		Chief c = new Chief(b);
		Client con = new Client(b, t, c1);
		
		Query q1 = new Query(b, t, c1, a);
		Query q2 = new Query(b, t, c1, c);
		Query q3 = new Query(b, t, c2, con);
		
		assertEquals(true, q1.send());
		assertEquals(true, q2.send());
		assertEquals(false, q3.send());
	}
	
}
