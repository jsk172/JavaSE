package section10.access1;

public class Car {
	public String model; //public
	protected int year; //protected 다른패키지 접근불가
	String color; //default 다른패키지 접근불가
	private String brand; //private 다른패키지 접근불가
	
	public void getInfo() {
		System.out.println("model : " + model);
		System.out.println("year : " + year);
		System.out.println("color : " + color);
		System.out.println("brand : " + brand);
	}
	

}
