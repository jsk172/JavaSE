package section05;

/*
1번 분석하고 연습해보기

*
**
***
****
*****
******
*******

반복문 조건문 연습
 주말숙제 2중for문 코드 분석하기 
 
2번
   *
  **
 ***
****

3번
   *
  ***
 *****
******* 
  
4번
			
   *   		i:0  j: 4,5,6   j - i > 3
  ***		i:1  j: 5,6     j - i > 3
 *****		i:2  j: 6       j - i > 3
*******		i:3
 *****		i:4  j:	6       
  ***		i:5  j:	5,6     
   *		i:6  j:	4,5,6  

   ☆
   *
  ***
 *****
******* 
  | | Merry Christmas~*
  
 
 구구단
  2 x 1 = 2		3 x 1 = 3	 4 x 1 = 4
  2 x 2 = 4
  ...
  2 x 9 = 18
  
  5 x 1 = 5 	6 x 1 = 6	 7 x 1 = 7
  ...
  5 x 9 = 45 	6 x ...
  
  8 x 1 = 1		9 x 1 = 9
  
  ....			9 x 9 = 81

 
 */

public class LoopHomeWork {
	public static void main(String[] args) {
//		for(int i = 0; i < 7; i++) {
//			for(int j = 0; j < 7; j++) {
//				if(i < 4) {
//					if(i+j < 3) {
//						System.out.print(" ");
//					} else if (j-i > 3) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//				} else {
//					if(i-j > 3) {
//						System.out.print(" ");
//					} else if(i+j > 9) {
//						System.out.print(" ");
//					}else {
//						System.out.print("*");
//					}
//				}
//			}
//			System.out.println();
//		}
		
//		System.out.println("   ☆");
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 7; j++) {
//				if(i+j < 3) {
//					System.out.print(" ");
//				} else if (j-i > 3) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println("  | | Merry Christmas ~*");
		
		
		for(int x = 0; x < 3; x++) {
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 3; j++) {
					int dan = j + 2 + x * 3 ; 
					if(dan < 10)
						System.out.printf("%d x %d = %d  ", dan, i+1, dan * (i+1));
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}







