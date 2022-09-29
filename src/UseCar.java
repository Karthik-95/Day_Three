
public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="bmw";
		car1.model="a1";
		car1.price=400000;
		car1.isPetrol=1==0;
		Car car2=new Car();
		car2.brand="tata";
		car2.model="a2";
		car2.price=300000;
		car2.isPetrol=1==1;
		Car car3=new Car();
		car3.brand="swift";
		car3.model="a3";
		car3.price=200000;
		car3.isPetrol=1==1;
		int a=car1.brand.length();
		System.out.println(a);
		int b=car2.brand.length();
		System.out.println(b);
		int c=car3.brand.length();
		System.out.println(c);
		int total=car1.price+car2.price+car3.price;
		System.out.println(total);
		String d=car1.brand.toUpperCase();
		System.out.println(d);
		String e=car2.brand.toUpperCase();
		System.out.println(e);
		String f=car3.brand.toUpperCase();
		System.out.println(f);
		
	}

}
