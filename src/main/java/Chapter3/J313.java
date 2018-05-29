package Chapter3;

class J313 {
	public static void main(String[] args) {
		StringBuilder b = new StringBuilder("rumble"); 
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1); 
		System.out.println(b);
	}
}
