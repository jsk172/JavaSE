package section04;
/*
 * 2.switch ~ case 문(if문이랑 비슷)
 */
public class Conditional03 {
	public static void main(String[] args) {
		int num = 1;
		
		switch(num) {
		case 0:
			System.out.println("num은 0입니다.");
			break;
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 2:
			System.out.println("num은 2입니다.");
			break;
		case 3:
			System.out.println("num은 3입니다.");
			break;
		default:
			System.out.println("num은 0~3이 아닙니다.");
			break;
		}
	}

}
