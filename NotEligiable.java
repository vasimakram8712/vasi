package Error;

public class NotEligiable {
      public static void main (String[] args) {
	int age =17;
	try {
	if(age>=18) {
		
		System.out.println("you are eligible");
	
	}
	else {
	   System.out.println("not eligible");
	}
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("you will put sutable age");
	}
}
}