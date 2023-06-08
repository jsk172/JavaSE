package section08;

public class Method08 {
	public static void main(String[] args) {
		int[] values = {2, 4, 6, 22, 55};
		
		int[] result = sumAndAvg(values);
		
		System.out.println("Sum : " + result[0]);
		System.out.println("Average : " + result[1]);
	}
	
	//8. 인자o 리턴o 배열리턴
	public static int[] sumAndAvg(int[] values) {
		int[] result = new int[2];
		
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		int avg = sum / values.length;
		
		result[0] = sum;
		result[1] = avg;
		
		return result;
		
	}
}
