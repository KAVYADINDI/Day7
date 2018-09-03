package cg.day7.que9;

import java.util.Objects;

public class Numbers implements Comparable<Numbers> {
private int number;

	
	public Numbers(int number) {
	super();
	this.number = number;
}

	public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

	public Numbers() {
	super();
	// TODO Auto-generated constructor stub
}
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Numbers other = (Numbers) obj;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String  toString() {
		
		return  number+" " ;
	}

	@Override
	public int compareTo(Numbers o) {
		return Integer.compare(this.number,o.number);
	}

}