# Day 1
### [Task](https://adventofcode.com/2015/day/2)
## Code
```java
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
		String data = "0";
		String newData = "0";

		File myFile = new File("paper.txt");
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

		System.out.println("The elves should order " + finalPaper + " square feet of wrapping paper!");
		sc.close();
		scan.close();
	}
}
```

## Input
```
29x13x26
11x11x14
27x2x5
6x10x13
15x19x10
26x29x15
8x23x6
17x8x26
20x28x3
23x12x24
...
```

## Output
```
The elves should order 1586300 square feet of wrapping paper!

```
