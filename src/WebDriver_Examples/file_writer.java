package WebDriver_Examples;

import java.io.FileWriter;
import java.io.IOException;

public class file_writer {

	public static void main(String[] args) throws Exception {
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\rajesh.txt");
		file.write("welcome to selenium");
		file.write("\n");
		file.write("this is second line");
		System.out.println("successfully written");
		file.close();
	}

}
