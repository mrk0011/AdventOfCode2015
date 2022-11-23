import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tag3 {

	public static void main(String[] args) throws FileNotFoundException {
		int pCounter = 0; // Present Counter
		char dCase = 0; // Directions Case
		String data = "";
		Scanner sc = null;
		File myFile = new File("Tag3.txt");
		try {
			sc = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR! File not found");
		}

		while (sc.hasNext()) {
			data = sc.nextLine();

		}
		int stringSize = data.length();
		System.out.println(stringSize);

	}

}
