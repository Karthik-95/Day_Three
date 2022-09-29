
public class Demo6 {
	public static void main(String[]args) {
		String a="Java,Paython,C++,C";
		String[]a1=a.split(",");
		char[]b=a1[0].toCharArray();
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		String c=a1[1].substring(3);
		System.out.println(c);
		String d=a1[2].concat(a1[3]);
		System.out.println(d);
		
	}

}
