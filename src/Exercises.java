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
		
		for(int i = 0; i < n; i++){
			finalArray.add(values.get(i));
		}
		int ind = n;

		for(int x = n; x < (n * 2); x++){
			finalArray.add(values.get(values.size() - ind));
			ind--;
		}
		return finalArray;
	}
	
	public int difference(ArrayList<Integer> numbers) {
		// write your code here
		
		if(numbers == null || numbers.size() == 0){
			return -1;
		}else{
			int min = numbers.get(0);
			int max = numbers.get(0);

			for(int number : numbers){
				if(number > max){
					max = number;
				}
				if(number < min){
					min = number;
				}
			}
			return max - min;

		}
	}
	
	public double biggest(ArrayList<Double> numbers) {
		// write your code here
		
		if(numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0){
			return -1.0;		// default return value to ensure compilation
		}else{
			double biggest = numbers.get(0);
			double middle = numbers.get(numbers.size() / 2);
			double end = numbers.get(numbers.size() - 1);

			if(biggest < middle){
				biggest = middle;
			}
			if(biggest < end){
				biggest = end;
			}
			return biggest;			
		}
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here
		
		if(values == null || values.size() < 3 || values.size() % 2 == 0){
			return new ArrayList<String>();	// default return value to ensure compilation
		}else{
			int indexMid = values.size() / 2;
			String middle = values.get(indexMid);
			String upper = values.get(indexMid + 1);
			String lower = values.get(indexMid - 1);

			ArrayList<String> finalArray = new ArrayList<String>();

			finalArray.add(lower);
			finalArray.add(middle);
			finalArray.add(upper);
		
			return finalArray;
		}
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
