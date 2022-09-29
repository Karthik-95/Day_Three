
public class Demo4 {
	public static void main(String[]args) {
	String a="Julius,Caesar,Brutus";
	String[]b=a.split(",");
	String c=b[0].toUpperCase();
	System.out.println(c);
	String d=b[1].toLowerCase();
	System.out.println(d);
	int e=c.length();
	System.out.println(e);
	int f=d.length();
	System.out.println(f);
	int g=b[2].indexOf('u');
	System.out.println(g);
	char h=b[2].charAt(5);
	System.out.println(h);
	
	}
}
