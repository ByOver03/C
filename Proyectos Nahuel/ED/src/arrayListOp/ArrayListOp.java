package arrayListOp;

import java.security.InvalidParameterException;

public class ArrayListOp {

	public int findClosestToAverage(int[] array) { 
	    
		double sum = 0;
	    
	    if(array == null) {
			throw new InvalidParameterException();
		}
		else {
		    for(int i = 0; i < array.length; i++) {
		        sum += array[i]; 
		    }    
		    double avg = sum/array.length; 
		    
		    double difference = Math.abs(array[1] - avg);
		    int closest = array[1];
		    for (int i = 0; i < array.length; i++) {
		        double diff = Math.abs(array[i] - avg);
		        if(difference > diff) {
		            difference = diff;
		            closest = array[i];
		        }
		    }		    
		    return closest;
		}
	}
	
	public static void main(String[] args) {
		
		int[] lista = {1,2,5,7,29};
		ArrayListOp a1 = new ArrayListOp();
		
		System.out.println(a1.findClosestToAverage(lista));
		System.out.println(a1.findClosestToAverage(new int[]{-4,-3,-6,-7,-2}));
		//System.out.println(a1.findClosestToAverage(new int[]{5}));
		//System.out.println(a1.findClosestToAverage(new int[]{})); 
		//System.out.println(a1.findClosestToAverage(null));
		
	}

}


