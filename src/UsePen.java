
public class UsePen {
	public static void main (String[]args) {
		Pen pen1=new Pen();
		pen1.brand="reynolds";
		pen1.price=5;
		pen1.colour="blue";
		Pen pen2=new Pen();
		pen2.brand="parker";
		pen2.price=25;
		pen2.colour="black";
		String a=pen1.brand.toUpperCase();
		String b=pen2.brand.toUpperCase();
		boolean c=pen1.brand.contains("r");
		boolean d=pen2.brand.contains("r");
		boolean e=pen1.colour.equals("BLUE");
		boolean f=pen2.colour.equals("black");
		char g=pen2.colour.charAt(4);
		char h=pen1.colour.charAt(2);
		int i=pen1.colour.length();
		int j=pen2.colour.length();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		
	}
}
