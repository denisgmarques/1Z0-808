package Chapter3;
import java.util.*;

class ListToArray {
	public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
		list.add("coke");
		list.add("pepsi");
		list.add("miranda");

		System.out.println("Total Array::" + list);

		String[] ws1 = new String[list.size()];
		String[] ws2 = list.toArray(ws1);

		System.out.println("ws1 == ws2: " + (ws1 == ws2));
		System.out.println("ws1: " + Arrays.toString(ws1));
		System.out.println("ws2: " + Arrays.toString(ws2));

		ws1 = new String[1];
		ws1[0] = "Test Data";
		
		ws2 = list.toArray(ws1);

		System.out.println("ws1 == ws2: " + (ws1 == ws2));
		System.out.println("ws1: " + Arrays.toString(ws1));
		System.out.println("ws2: " + Arrays.toString(ws2));




	}
}
