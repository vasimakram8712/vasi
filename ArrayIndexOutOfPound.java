package Error;

public class ArrayIndexOutOfPound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("welcome");
	
		int[] nums= {1,2,3,4,5,6};
		try {
			System.out.println(nums[7]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
			System.out.println("value is not avilable");
			
			
		}
	   System.out.println("thankyou");
	}
       
}
