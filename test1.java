package Error;

public class test1 {
      public static void main (String[] args) {
	String value =null;
	try {
		System.out.println(value.length());
	}
	    catch(NullPointerException n) {
     n.printStackTrace();
	    System.out.println("msg");
	    }
       System.out.println("invalid data");
      }
}