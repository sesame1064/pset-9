import java.util.ArrayList;

public class Exercises {
	//uses .get() and .size()

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
		//easy to add values to array without making one and setting size
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
		
		if(numbers == null || numbers.size() < 3){
			return false;	// default return value to ensure compilation
		}
		for (int i = 0; i < numbers.size() - 2; i++) {
			if (numbers.get(i) < numbers.get(i + 1) && numbers.get(i + 1) < numbers.get(i + 2)) return true;
		} return false;


	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here
		//adjacent to every other element 
		if(numbers == null || numbers.size() < 2){
			return false;
		}
		for(int i = 1; i < numbers.size() - 1; i++){
			if(!(numbers.get(i) == x || numbers.get(i - 1) == x || numbers.get(i + 1) == x)){
				return false;
			}
		}
		return true;
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here
		//Given an ArrayList of Integers, numbers, return true if it is possible to 
		//split the ArrayList so that the sum of the left half is equal to the sum of the right half. 
		if(numbers == null || numbers.size() < 3){
			return false;
		}
		for(int i = 1; i < numbers.size() - 1; i++){
			if(numbers.get(i - 1) % 2 == 0 && numbers.get(i) % 2 == 0 && numbers.get(i + 1) % 2 == 0){
				return true;
			}
		}  
		for(int y = 1; y < numbers.size() -1; y++){
			if(numbers.get(y - 1) % 2 != 0 && numbers.get(y) % 2 != 0 && numbers.get(y + 1) % 2 != 0){
				return true;
			}
		}
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here
		
		if(numbers == null || numbers.size() < 2){
			return false;
		}
			for (int x = 1; x < numbers.size(); x++){
				int a = 0; 
				int b = 0;

				for(int y = 0; y < x; y++){
					a += numbers.get(y);
				}
				for(int z = x; z < numbers.size(); z++){
					b += numbers.get(z);
				}
				if(a == b){
					return true;
				}
			}
		return false;	// default return value to ensure compilation
	}

	public int clumps(ArrayList<String> values) {
		// write your code here
		/////////
		if (values == null) return -1;
		for (String word : values) {
			if (word == null) return -1;
		}
		int output = 0; boolean in = false;
		for (int i = 1; i < values.size(); i++) {
			if (values.get(i).equals(values.get(i - 1))) {
				if (!in) {
					in = true;
					output++;
				}
			} else in = false;
		} return output;
	}
}
