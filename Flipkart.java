package Error;

public class Flipkart {

	public static void main(String[] args)  throws ProductNotFoundException  {
		// TODO Auto-generated method stub
  
		int price =10000;
   try {
		if (price<=10000) {
       throw new ProductNotFoundException("msg");
	}
       else {
    	   System.out.println("product");
       }
   }
        catch(Exception e) {
        	e.printStackTrace();
        	System.out.println("not found");
        }
   }
}