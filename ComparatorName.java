package cst135;

import java.util.Comparator;

public class ComparatorName implements Comparator<BaseContact> {

	@Override
	public int compare(BaseContact o1, BaseContact o2) {
		return ((String) o1.getName()).compareTo(o2.getName());

	}
}