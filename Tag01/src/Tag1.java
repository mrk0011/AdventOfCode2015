import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tag1 {

	public static void main(String[] args) throws FileNotFoundException {

		File myFile = new File("floor.txt");
		Scanner sc = new Scanner(myFile);
		String data;
		int zähler = 0;
		data = sc.nextLine();
		int StringSize = data.length();

		for (int i = 0; i < StringSize; i++) {
			char c = data.charAt(i);
			if (c < 41) {
				zähler = zähler + 1;
			} else
				zähler = zähler - 1;

		}
		System.out.println("Santa needs to take his presents to floor " + zähler + "!");

		sc.close();
	}

}