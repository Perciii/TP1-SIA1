package ex4;

public class Authorisations {
	private boolean global;
	private boolean baser;
	private String base;
	private String table;
	private String column;
	
	public String getBase() {
		return base;
	}
	public String getTable() {
		return table;
	}
	public String getColumn() {
		return column;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public void setColumn(String column) {
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
