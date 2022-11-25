import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tag3 {

	public static void main(String[] args) throws IOException {
		int pCounter = 0; 				// Present Counter
		char dCase = 0; 				// Directions Case
		String data = "";
		Scanner sc = null;
		File myFile = new File("input.txt");
		try {
			sc = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR! File not found");
		}

		while (sc.hasNext()) {
			data = sc.nextLine();

		}
		int stringSize = data.length();

		FileWriter myWriter = new FileWriter(new File("output.txt"));
		myWriter.write("" + stringSize);
		
		myWriter.close();
	}

}
