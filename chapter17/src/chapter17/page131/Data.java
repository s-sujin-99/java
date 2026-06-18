package chapter17.page131;

import java.util.Objects;

public class Data implements Comparable<Data>{
	private int number;

	public Data() {
		this(0);
	}
	
	public Data(int number) {
		super();
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(number);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Data) {
			Data data = (Data)obj;
			if (data.number == this.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Data o) {
		// TODO Auto-generated method stub
		return this.number - o.number;
	}

	@Override
	public String toString() {
		return  number + " ";
	}
	
	
	
}
