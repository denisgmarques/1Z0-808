package Chapter3;
import java.util.*;

public class RemoveIfLambda {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		//Predicate<Person> personPredicate = p-> p.getPid() == pid;
	        list.removeIf(p -> p % 2 == 0);

		list.forEach(p -> { System.out.println(p); });
	}
}
