import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		
		// write your code here
		int lastIndA = a.size() - 1;
		int lastIndB = b.size() - 1; 
		if(a.get(0) == b.get(0) || a.get(lastIndA) == b.get(lastIndB)){
			return true;
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		// write your code here

		if(values == null || n < 0 || values.size() < n){
			return new ArrayList<String>();
		}

		ArrayList<String> finalArray = new ArrayList<>();
		
		for(int i = 0l i < n; i++){
			finalArray.add(values.get(i));
		}
		int ind = n;

		for(int x; x < (n * 2); x++){
			finalArray.add(values.get(values.size() - ind));
			ind--;
		}
		return finalArray;
	}
	
	public int difference(ArrayList<Integer> numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public double biggest(ArrayList<Double> numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(ArrayList<String> values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
