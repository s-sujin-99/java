package chapter17.page49;

import java.util.Objects;


public class Data2 implements Comparable<Data2>{
	private int no;
	
	
	Data2(int no) {
		super();
		this.no = no;
		
	}

	@Override
	public String toString() {
		return  no + " " ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Data2)) {
			return false;
		}
		Data2 date = (Data2)obj;
		if (date.no == no ) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(no);
	}

	@Override
	public int compareTo(Data2 o) {
		int result = Integer.compare(this.no, o.no);
		return result;
	}
	
	
}
