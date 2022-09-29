
public class UseLaptop {
	public static void main(String[]args) {
		Laptop laptop1=new Laptop();
		laptop1.brand="lenovo";
		laptop1.price=30000;
		laptop1.colour="black";
		laptop1.isWarranty=1==1;
		String a=laptop1.brand.toUpperCase();
		int b=laptop1.brand.length();
		boolean c=laptop1.brand.startsWith("d");
		char d=laptop1.brand.charAt(b-1);
		String e=laptop1.colour.toLowerCase();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
