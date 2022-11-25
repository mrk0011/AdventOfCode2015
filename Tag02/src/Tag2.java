import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tag2 {

	public static void main(String[] args) throws IOException {

		int p = 0;
		int paper = 0;
		int finalPaper = 0;
		String data;
		String newData;

		File myFile = new File("input.txt");
		FileWriter Paper = new FileWriter("newPaper.txt");
		File myPaper = new File("newPaper.txt");
		Scanner sc = new Scanner(myFile);

		while (sc.hasNextLine()) {
			data = sc.nextLine();
			newData = data.replace("x", " ");
			Paper.write(newData);
			Paper.write("\n");
			p++;

		}
		Paper.close();
		Scanner scan = new Scanner(myPaper);
		for (int a = 0; a < p; a++) {
			int l = scan.nextInt();
			int w = scan.nextInt();
			int h = scan.nextInt();

			paper = (2 * l * w) + (2 * w * h) + (2 * h * l);
			if ((l * w) < (w * h) && (l * w) < (h * l)) {
				paper = paper + (l * w);
			} else if ((w * h) < (h * l)) {
				paper = paper + (w * h);
			} else {
				paper = paper + (h * l);
			}
			finalPaper = finalPaper + paper;
		}

		FileWriter myWriter = new FileWriter(new File("output.txt"));
		myWriter.write("" + finalPaper);

		sc.close();
		scan.close();
		myWriter.close();
	}
}