package Chapter3;


class J7 {
	public static void main(String[] args) {
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total += letters.substring(1, 2).length();
		total += letters.substring(5, 4).length();
		total += letters.substring(6, 6).length();
		System.out.println(total);
	}
}
