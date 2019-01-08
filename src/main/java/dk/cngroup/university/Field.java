package dk.cngroup.university;

import com.sun.org.glassfish.gmbal.DescriptorFields;

import java.lang.reflect.Array;

public enum Field {
	ACCESSIBLE("."),
	INACCESSIBLE("0");
	private final String symbol;
	Field(String symbol) {
		this.symbol = symbol;

	}
	@Override
	public String toString() {
		return symbol;
	}

}
