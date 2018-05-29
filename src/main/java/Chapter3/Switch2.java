package Chapter3;
public class Switch2 {
	public static void main(String[] args) {
		String s = "A";

		switch(s) {
			case "a": System.out.print("a");
			default: System.out.print("DEFAULT");
			case "A": System.out.print("A CAPITAL");
		}
	}
}
