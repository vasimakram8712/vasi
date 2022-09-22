package Error;

public class overFlowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
		overFlow  s=new overFlow();
        s.add();
        		
	}
    catch(StackOverflowError e) {
    	e.printStackTrace();
    	System.out.println("overFlow tha value");
    }
}
}