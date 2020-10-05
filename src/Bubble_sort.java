import java.util.Random;

public class Bubble_sort {
	
	static boolean swaped;
	
	public static void swap(Comparable[] elements, int a, int b) {
		Comparable temp;
		temp = elements[a];
		elements[a] = elements[b];
		elements[b] = temp;
		swaped = true;
	}
	
	public static void sort(Comparable[] elements) {
		for(int i=0; i<elements.length; i++) {
			for(int j=1; j<elements.length; j++) {
				if(elements[j-1].compareTo(elements[j])>0) {
					swap(elements, j-1, j);
				}
			}
		if(swaped == false) break;
	}
	
	}
	public static void main(String[] args) {
		Comparable[] elements = new Comparable[100]; //max 100 000
		Random random = new Random(); 
		
		for(int i=0; i<elements.length; i++) {
			elements[i] = random.nextInt(100);
		}
		
		//long start = System.currentTimeMillis();
		sort(elements);
		//System.out.println("Time elapsed:  "+(System.currentTimeMillis() - start)+" ms");
		
		for(Comparable i:elements) {
		System.out.println(i);
		}
		
		

	}

}
