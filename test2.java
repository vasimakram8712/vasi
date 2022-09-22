package Error;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		String val="hi";
		try {
		int num=Integer.parseInt(val);
        System.out.println(num);
	}
       catch(NumberFormatException n) {
    	   n.printStackTrace();
    	   System.out.println("invalid data");
       }
}
}