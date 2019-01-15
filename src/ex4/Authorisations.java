package ex4;

public class Authorisations {
	private boolean global;
	private boolean baser;
	private Base base;
	private Table table;
	private Column column;
	
	
	public Base getBase() {
		return base;
	}
	public Table getTable() {
		return table;
	}
	public Column getColumn() {
		return column;
	}
	public void setBase(Base base) {
		this.base = base;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	public void setColumn(Column column) {
		this.column = column;
	}
	public boolean isGlobal() {
		return global;
	}
	public void setGlobal(boolean global) {
		this.global = global;
	}
	public boolean isBaser() {
		return baser;
	}
	public void setBaser(boolean baser) {
		this.baser = baser;
	}
	
	
	
}
