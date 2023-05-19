package section01;
/* 
 * 주석
 *  코드에 영향을 주지 않는 개발자가 사용하는 메모공간
 *  
 *  여러줄 주석
 */

public class Hello {
	public static void main(String[] args) {
		// 한줄 주석
		System.out.println("Hello, Java!");
		
		printNum(516);
	}
	
	public static void printNum(int num) {
		System.out.println("num :" + num);
	}

}
