package chapter17.page49;

import java.util.Objects;

public class Date {
	private int no;
	private String name;
	
	Date(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + no + ", "+ name +"]" ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Date)) {
			return false;
		}
		Date date = (Date)obj;
		if (date.name.equals(name) && date.no == no ) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(no, name);
	}
}
