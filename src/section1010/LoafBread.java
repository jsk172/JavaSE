package section1010;

public class LoafBread extends Bread{
	public boolean isSlice;
	
	@Override
	public void getInfo() {
		super.getInfo();
		
		System.out.println("isSlice: " + isSlice);
	}

}
