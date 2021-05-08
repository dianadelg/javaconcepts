package notes;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Parse {
	//how to parse from stdin
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = "";
		while(scanner.hasNextLine()) {
			line = scanner.nextLine();
			if(line.isEmpty()) {
				throw new NoSuchElementException("Empty line");
			}
			if(line.length()>=5) {
				System.out.println("Big word");
			}else {
				System.out.println("Small word");
			}
		}
		scanner.close();
		
	}
	
	
	

}
