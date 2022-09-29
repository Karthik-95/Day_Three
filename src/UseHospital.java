
public class UseHospital {
	public static void main (String[]args) {
		Hospital h1=new Hospital();
		h1.name="apollo";
		h1.location="chennai";
		h1.isAvail24=1==1;
		Hospital h2=new Hospital();
		h2.name="kauvery";
		h2.location="chennai";
		h2.isAvail24=1==1;
		Hospital h3=new Hospital();
		h3.name="sims";
		h3.location="chennai";
		h3.isAvail24=1==1;
		String a=h1.name.toUpperCase();
		String b=h2.name.toUpperCase();
		String c=h3.name.toUpperCase();
		int d=h1.location.length();
		boolean e=h1.equals(h2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
