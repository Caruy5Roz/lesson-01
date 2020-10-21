package Tasks;

public class task_3 {

	public static void main(String[] args) {
		
		// Завдання 3:
		
		int [] array = new int[]{4, 3, 5, 12, 21, 2, 1, 72, 0, 17};
		
		int max = getMax(array);
		System.out.println("Maximum Value is: "+max);
		
		int min = getMin(array);
	    System.out.println("Minimum Value is: "+min);
	}
	
	public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	
	public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
}
