package arrayListOp;

import java.security.InvalidParameterException;

public class ArrayListOpCorregit {
	public int findClosestToAverage(int[] array) { 
	    
		double sum = 0;
		int closest = 0;
	    
		//Afegir array buit
	    if(array == null || array.length == 0 ) {
			throw new InvalidParameterException();
		}
		else {
		    for(int i = 0; i < array.length; i++) {
		        sum += array[i]; 
		    }    
		    double avg = sum/array.length; 
		    
		    //Afegir comprovació longitud major que 1 per fer càlculs
		    if (array.length > 1) {
		    	double difference = Math.abs(array[1] - avg);
			    closest = array[1];
			    for (int i = 0; i < array.length; i++) {
			        double diff = Math.abs(array[i] - avg);
			        if(difference > diff) {
			            difference = diff;
			            closest = array[i];
			        }
			    }
		    } else {
		    	closest = array[0];
		    }
		    		    
		    return closest;
		}
	}
}
