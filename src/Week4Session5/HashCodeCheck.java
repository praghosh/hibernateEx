package Week4Session5;

import java.util.HashSet;
public class HashCodeCheck {
	private final String importantField;
	private final String anotherField;
	public HashCodeCheck(final String equalField, final String anotherField) {
		this.importantField = equalField;
		this.anotherField = anotherField;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((importantField == null) ? 0 : importantField.hashCode());
		return result;
	}
	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final HashCodeCheck other = (HashCodeCheck) obj;
		if (importantField == null) {
			if (other.importantField != null)
				return false;
		} else if (!importantField.equals(other.importantField))
			return false;
		return true;
	}
	public static void main(String[] args) {
		HashCodeCheck first = new HashCodeCheck("a","first");
		HashCodeCheck second = new HashCodeCheck("a","second");
		System.out.println (first.equals(second)); // true;
		HashSet <HashCodeCheck> test = new HashSet <HashCodeCheck> ();
		test.add(first);
		test.add(second); // It will not add as both the objects have same hash code.
		System.out.println(test.size()); // It will be 1. 
		// Now experiment by removing hashCode() or equals() or both.
	}
}
