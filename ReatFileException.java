package Error;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReatFileException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			File f = new File("C:\\New Doc\\document.txt");
			FileReader fr = new FileReader(f);
			int temp = 0;
			while ((temp = fr.read()) != -1) {
				System.out.print((char) (temp));
			}

		} catch (FileNotFoundException f) {
            f.printStackTrace();
            System.out.println(f);
		System.out.println("ender tha currit file name");
		}
	}
}