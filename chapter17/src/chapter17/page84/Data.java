package chapter17.page84;

import java.util.Objects;

public class Data {
	private int no;
	
	Data(int no) {
		super();
		this.no = no;
	}

	@Override
	public String toString() {
		return  no + " " ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Data)) {
			return false;
		}
		Data date = (Data)obj;
		if ( date.no == no ) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(no);
	}
}
