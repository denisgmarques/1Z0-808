package Chapter3;
public class Switch {
	public static void main(String[] args) {
		final char a = 'A', d = 'D';
		char grade = 'B';

		switch(grade) {
			case a: System.out.print("A");
			case 'B': System.out.print("great");
			case 'C': System.out.print("good"); 
			case d:
			case 'F': System.out.print("not good");
		}
	}
}
