
public class Binary_search {
	
	public static int binary(int[] elements, int key) {
		int lo = 0;
		int hi = elements.length-1;
		
		while(lo<=hi) {
			int mid= lo +(hi-lo)/2;
			if(key > elements[mid]) {
				lo = mid+1;
			}
			else if(key < elements[mid]) {
				hi = mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
		
	}

}
