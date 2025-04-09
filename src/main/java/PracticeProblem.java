public class PracticeProblem {
//import array
//import
	public static void main(String args[]) {
	}

	public static int[] bubbleSort(double[] arr) {
		//boolean hasitSwitched = true;
		int swaps = 0;
		boolean hasitSwitched = true;
		double temp;
		int steps = 0;


// int
		for (int i = 0; i < arr.length && hasitSwitched; i++){
			hasitSwitched = false;
			for (int j = 0; j < arr.length - 1 - i; j++){
				steps++;
				if (arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					hasitSwitched = true;
					swaps += 3;
				}
			}
		}


int[] stepNumber = new int[] {swaps, steps};
return stepNumber;

//println
	}

	public static int[] bubbleSort1(double[] numberss) {
		int swaps = 0;
		boolean hasitSwitched = true;
		double temp;
		int steps = 0;
		double[] arr = new double[numberss.length];
		for(int k = 0; k < numberss.length; k++){
			arr[k] = numberss[k];
		}

		for (int i = 0; i < arr.length && hasitSwitched; i++){
			hasitSwitched = false;
			for (int j = 0; j < arr.length - 1 - i; j++){
				steps++;
				if (arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					hasitSwitched = true;
					swaps += 3;
				}
			}
		}


int[] stepNum = new int[] {swaps, steps};
return stepNum;
	}

	public static int[] selectionSort1(double[] numberss){
		int min;
		double temp;
		int steps = 0;
		int swaps = 0;
		double[] arr = new double[numberss.length];
		for(int i = 0; i < numberss.length; i++){
			arr[i] = numberss[i];
		}

		for(int i = 0; i < arr.length - 1; i++){
			min = i;
			for(int j = 1 + i; j < arr.length; j++){
				steps++;
				if(arr[min] > arr[j]){
					min = j;
					swaps++;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			swaps += 3;
		}

		int[] sorted = new int[]{swaps,steps};
		return sorted;
	}
//s


	public static int[] selectionSort(double[] arr){
		int min;
		double temp;
		int steps = 0;
		int swaps = 0;
		
		for(int i = 0; i < arr.length - 1; i++){
			min = i;
			for(int j = 1 + i; j < arr.length; j++){
				steps++;
				if(arr[min] > arr[j]){
					min = j;
					swaps++;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			swaps += 3;
		}



		int[] sorted = new int[]{swaps,steps};
		return sorted;
	}

	public static int[] insertionSort(double[] arr){
		int steps = 0;
		int swaps = 0;
		for(int j = 1; j < arr.length; j++){
			double key = arr[j];
			swaps++;
			int index = j-1;
			while(index >= 0 && key < arr[index]){
				arr[index + 1] = arr[index];
				index--;
				swaps++;
				steps++;
			}
			arr[index+1] = key;
			swaps++;
		}
		
		int[] sorted = new int[]{swaps,steps};
		return sorted;
	}


	public static int[] insertionSort1(double[] numberss){
		int steps = 0;
		int swaps = 0;
		double[] arr = new double[numberss.length];
		for(int i = 0; i < numberss.length; i++){
			arr[i] = numberss[i];
		}
		for(int j = 1; j < arr.length; j++){
			double key = arr[j];
			swaps++;
			int index = j-1;
			while(index >= 0 && key < arr[index]){
				arr[index + 1] = arr[index];
				index--;
				swaps++;
				steps++;
			}
			arr[index+1] = key;
			swaps++;
		}
		


		int[] sorted = new int[]{swaps,steps};
		return sorted;
	}






	public static String leastSwaps(double[] numberss){
		if (insertionSort1(numberss)[0] < bubbleSort1(numberss)[0]){
			if(selectionSort1(numberss)[0] < insertionSort(numberss)[0]){
				return "Selection";
			}
			else{
				return "Insertion";
			}
		}
		else if(selectionSort(numberss)[0] < bubbleSort(numberss)[0]){
return "Selection";
		}
		else{
			return "Bubble";
		}

	}





	public static String leastIterations(double[] numberss){
		if (insertionSort1(numberss)[1] < bubbleSort1(numberss)[1]){
			if(selectionSort1(numberss)[1] < insertionSort(numberss)[1]){
				return "Selection";
			}
			else{
				return "Insertion";
			}
		}



		else if(selectionSort(numberss)[1] < bubbleSort(numberss)[1]){
return "Selection";
		}
		else{
			return "Bubble";
		}

	}
}


//NOT NEEDED
//println


//public static int[] bubbleSort(double[] nums) {/
//	6        int swaps = 0;
//	7        int steps = 0;
//	8        double[] arr = Arrays.copyOf(nums, nums.length);
//9        boolean swapped;

//System.out.println("Sort with least swaps: " + leastSwapsSort);
//117       // System.out.println("Sort with least iterations: " + leastIterationsSort);
//118    }
//119}m