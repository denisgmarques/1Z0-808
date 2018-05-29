package Chapter3;

import java.util.*;

class J324 {
	public static void main(String[] args) {
		String [] names = {"Tom", "Dick", "Harry"};
		List<String> list = Arrays.asList(names);
		list.set(0, "Sue");
		System.out.println(names[0]);
	}
}
