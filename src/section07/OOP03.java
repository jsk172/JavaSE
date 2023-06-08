package section07;

public class OOP03 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.drive();
		car2.parking();
		
		System.out.println(System.identityHashCode(car1));
		System.out.println(System.identityHashCode(car2));
		
		// 기본형/지역변수
		int num = 10;
		double PI = 3.14;
	}
}
