import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Bubble_vjezba {
	
	static boolean swapped;
	
	public static Comparable[] readElements(String path) throws FileNotFoundException {
		Comparable[] elements = new Comparable[100];
		Scanner scanner = new Scanner(new File(path));
		int i = 0;
		while(scanner.hasNextLine()) {
			elements[i] = Integer.parseInt(scanner.nextLine());
			i++;
		}
		scanner.close();
		return elements;
	}
	
	public static void writeToFile(String path, Comparable[] elements) throws IOException {
		File file = new File(path);
		FileWriter fw = new FileWriter(path);
		fw.write(elements.toString());
		fw.close();
	}
	
	@SuppressWarnings({"rawtypes","unchecked"})
	public static void sort(Comparable[] elements) {
		for(int i=0;i<elements.length;i++) {
			for(int j=1;j<elements.length;j++) {
				if(elements[j-1].compareTo(elements[j])>0) {
					swap(elements, j-1, j);
				}
			}
			if(swapped == false) break;
		}
	}
	
	@SuppressWarnings({"rawtypes","unchecked"})
	public static void swap(Comparable[] elements,int a, int b) {
		Comparable temp;
		temp= elements[a];
		elements[a]= elements[b];
		elements[b]=temp;
		swapped=true;
	}

	public static void main(String[] args) throws IOException {
		Comparable[] elements = readElements("C:/Users/Sead/Desktop/numbers.txt");

		sort(elements);
		
		for(Comparable i:elements) {
			System.out.println(i);
		}
		
		writeToFile("C:/Users/Sead/Desktop/numbers.txt",elements);

	}

}
