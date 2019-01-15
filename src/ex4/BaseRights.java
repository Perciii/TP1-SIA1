package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BaseRights implements RightsHandler{
	private final String name;
	private List<TableRights> tables = new ArrayList<>();
	
	public BaseRights(String n, ArrayList<TableRights> t) {
		Objects.requireNonNull(t);
		name = n;
		tables = t;
	}
	
	public List<TableRights> getTables() {
		return tables;
	}
	
	public void addTable(TableRights t) {
		Objects.requireNonNull(t);
		tables.add(t);
	}
	
	public String getName() {
		return name;
	}
	
	public boolean checkRights(Query q) {
		if(q.getA().isBaser()) {
			return true;
		}
		if(q.getA().getBase().getName() == name) {
			return q.getTable().checkRights(q);
		}
		return false;
	}
	
	
	
}
