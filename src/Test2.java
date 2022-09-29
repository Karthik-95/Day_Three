
public class Test2 {
	public static void main(String[]args) {
		String a="world wide wonder";
		String[]b=a.split(" ");
		int c=b[0].length();
		int d=b[1].length();
		int e=b[2].length();
		String f=b[0].toUpperCase();
		String g=b[1].toUpperCase();
		String h=b[2].toUpperCase();
		String i=a.concat(" programs");
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}

}
