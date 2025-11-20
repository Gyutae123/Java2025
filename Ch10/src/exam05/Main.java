package exam05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Temp.txt");
		int ch;

		try {
			FileReader reader = new FileReader("Temp.txt");
			ch = reader.read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Error!");
		}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("Temp.txt");
			fileOutputStream.write(123);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
