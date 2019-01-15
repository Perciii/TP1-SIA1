package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Table implements RightsHandler {
	private final String name;
	private List<Column> columns;
	
	public Table(String n, ArrayList<Column> a) {
		Objects.requireNonNull(a);
		name = n;
		columns = a;
	}
	
	public void addColumns(Column c) {
		columns.add(c);
	}
	
	public String getName() {
		return name;
	}
	
	public boolean checkRights(Query q) {
		if(q.getA().getTable().getName() == name) {
			return q.getColumn().checkRights(q);
		}
		return false;
	}
	
}
