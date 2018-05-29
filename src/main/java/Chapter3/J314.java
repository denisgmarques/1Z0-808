package Chapter3;


class J314 {
	public static void main(String[] args) {
		StringBuilder puzzle = new StringBuilder("Java");
		puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
		System.out.println(puzzle);
	}
}
