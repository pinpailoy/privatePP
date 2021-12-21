import java.io.File;
import java.util.Scanner;


public class textFile {
	public static void main(String[] args) {
		//C:\MyDirectory\Directory1\myfile1.txt
		//C:\MyDirectory\Directory2\Subdirectory\myfile1.txt
		Scanner path = new Scanner(System.in);
		System.out.println("enter path: ");
		String fname =path.next();
		File file = new File(fname);
		if (file.getName().toString().endsWith(".txt")) {
			int index = fname.lastIndexOf('\\');
			String fileName = fname.substring(index + 1);
			System.out.println(fileName);
		}
		else {
			System.out.println("skip scanning any directories named “temp” or “logs");
		}
		
	
	}

}
