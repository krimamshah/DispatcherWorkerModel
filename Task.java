
/**
 * This class defines the taskes that are to be performed by the Worker Threads in the ThreadPool.
 */


public class Task {
    
   
	
	/**
	 * Add two variables
	 * @param x
	 * @param y
	 * @return
	 */
	public double addition(double x,double y){
		return x+y;
	}
	
	/**
	 * Multiply two variables
	 * @param x
	 * @param y
	 * @return
	 */
	 public double multiplication(double x,double y){
		 return x*y;
	 }
	
	 /**
	  * Subtract two variables
	  * @param x
	  * @param y
	  * @return
	  */
	 public double subtraction(double x,double y){
		 return x-y;
	 }

}
