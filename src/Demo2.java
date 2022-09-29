
public class Demo2 {
	public static void main(String[]args) {
	String a="Hello";
	String a1="He";
	boolean b=a.contains("llo");
	System.out.println(b);
	boolean c=a.startsWith("H");
	System.out.println(c);
	boolean d=a.endsWith("o");
	System.out.println(d);
	boolean e=a.equals("Hello");
	System.out.println(e);
	boolean f=a.equalsIgnoreCase("heLlo");
	System.out.println(f);
	boolean g=a.contains(a1);
	System.out.println(g);
	boolean h=a.startsWith(a1);
	System.out.println(h);
	boolean i=a.endsWith(a1);
	System.out.println(i);
	}
}
