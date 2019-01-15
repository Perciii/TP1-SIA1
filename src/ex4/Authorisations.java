package ex4;

public class Authorisations {
	private boolean global;
	private boolean baser;
	private BaseRights base;
	private TableRights table;
	private ColumnRights column;
	
	
	public BaseRights getBase() {
		return base;
	}
	public TableRights getTable() {
		return table;
	}
	public ColumnRights getColumn() {
		return column;
	}
	public void setBase(BaseRights base) {
		this.base = base;
	}
	public void setTable(TableRights table) {
		this.table = table;
	}
	public void setColumn(ColumnRights column) {
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
