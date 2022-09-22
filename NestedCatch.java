package Error;

public class NestedCatch {
	public static void  main(String[] args) {
      try {
      String[] vals= {"ram","raj","mani","siva"};
      System.out.println(vals[2]);
       System.out.println(vals[1].charAt(10));
       int num =Integer.parseInt(vals[1]);
      }
       catch(ArrayIndexOutOfBoundsException ae) {
    	 System.out.println(ae);   
       }
       catch(StringIndexOutOfBoundsException si) {
    	   System.out.println(si);
       }
      catch(NumberFormatException ne) {
    	  System.out.println(ne);
      }
	}
}