public class PracticeProblem {

	public static void main(String args[]) {

	}

	
			public static int[] insertionSort(double[] nums) {
				int swaps = 0;
				int steps = 0;
				
				for (int i = 1; i < nums.length; i++) {
					double key = nums[i];
					int j = i - 1;
					steps++; 
					
					while (j >= 0 && nums[j] > key) {
						steps++; 
						nums[j + 1] = nums[j];
						swaps += 1; 
					}
					nums[j + 1] = key;
					swaps += 1; 
				}
				
				return new int[]{swaps, steps};
			}
			
			
		

	
	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
