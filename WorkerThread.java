
/**
 * The WorkerThread Class is called by the DispatcherThread Class.
 * It implements the Runnable Interface. This class performs the task assingned by the dispatcher
 * and displays the result.
 */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;

public class WorkerThread implements Runnable{
	
	//Variables
	private BlockingQueue<String> taskQueue = new LinkedBlockingQueue<String>();
	private boolean empty = false;
	private final Task taskAssigned;
	private  String job;
	private double result = 0.0;
	DispatcherWorkerMain display = new DispatcherWorkerMain();
	
	/**
	 * Workerthread constructor taskes in the blocking queue and the frame as input parameters.
	 * It initialises taskAssigned,taskQueue,job and display
	 * @param queue
	 * @param display
	 */
	public WorkerThread(BlockingQueue<String> queue, DispatcherWorkerMain display){
		this.taskAssigned = new Task();
		this.taskQueue = queue;
		if(taskQueue.isEmpty())
			empty = true;            //sets the empty variable to true
		job = null;
		this.display = display;
		
	}
	
	/**
	 * WorkerThread run method is called when the dispatcher creates worker threads.
	 */
	@Override
	public synchronized void run(){
		try{
       //if the queue is empty, the worker is will suspend itself and sleep            
		while(empty){
			Thread.sleep(2000);
			wait();	
		}
		//if the queue is not empty worker thread which is sleeping is notified.
		empty = false;
		notify();
                    
	    double x ;
	    double y ;
            
		if(!taskQueue.isEmpty()){
                   
                    Thread.sleep(3000);
			job = taskQueue.take();              //removes the task from the blocking queue 
            display.removeFromBlockingQueue();   //calls the method to display how the job is removed from the queue.
			
            //splits the input line and stores it in an array fo strings
            String[] words = job.split(" ");
			if(words.length>0){
			 x = Double.parseDouble(words[1]);  //converts string values to double in order to compute them .
			 y = Double.parseDouble(words[2]);
			
			 //worker thread checks what type of work it has been assigned, performs the task and displays the result accordingly.
			// Once the task is done it will sleep till the new task is assigned by the dispatcher.
			if(words[0].equals("add")){
				result = taskAssigned.addition(x, y);
                                displayThreadResult(Thread.currentThread().getName(),job, result);
				Thread.sleep(3000);
                                displayThreadSleepStatus(Thread.currentThread().getName());
			}
			else if(words[0].equals("multiply")){
                                result = taskAssigned.multiplication(x, y);
                                displayThreadResult(Thread.currentThread().getName(),job, result);
				Thread.sleep(3000);
                                displayThreadSleepStatus(Thread.currentThread().getName());	
			}else{
                                result = taskAssigned.subtraction(x, y);
                                displayThreadResult(Thread.currentThread().getName(),job, result);
				Thread.sleep(3000);
                                displayThreadSleepStatus(Thread.currentThread().getName());
				}
			}
			else
				System.out.println("Worker Thread "+Thread.currentThread().getName() + " I am sleeping");
		
		}
		}catch(InterruptedException e){
				
			} catch (BadLocationException ex) {
                Logger.getLogger(WorkerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
	
	/**
	 * This function displays the input given by the dispatcher to the worker
	 * and the output of the task performed by the worker.
	 * @param thread
	 * @param job
	 * @param result
	 */

        private void displayThreadResult(String thread,String job,Double result){
            String[] words = thread.split("-");
            String line = "<HTML>"+job+"<br>"+"Result= "+Double.toString(result)+"</HTML>";
            if(words[3].equals("1")){
                display.setWorker1Text(line);
               // display.setDispatcherText(job);
            }
            else if(words[3].equals("2")){
                display.setWorker2Text(line);
                //display.setDispatcherText(job);
            }
            else if(words[3].equals("3")){
                display.setWorker3Text(line);
                //display.setDispatcherText(job);
            }
            else if(words[3].equals("4")){
                display.setWorker4Text(line);
                //display.setDispatcherText(job);
            }
            else if(words[3].equals("5")){
                display.setWorker5Text(line);
                //display.setDispatcherText(job);
            }
            
        }
        
        /**
         * This function displays the sleep state of the worker.
         * If the worker has not been assigned any job, it sleeps till awaken by the dispatcher.
         * @param sleepStatus
         */
        private void displayThreadSleepStatus(String sleepStatus){
            String[] words = sleepStatus.split("-");
            String line = "I am sleeping";
            if(words[3].equals("1"))
                display.setWorker1Text(line);
            else if(words[3].equals("2"))
                display.setWorker2Text(line);
            else if(words[3].equals("3"))
                display.setWorker3Text(line);
            else if(words[3].equals("4"))
                display.setWorker4Text(line);
            else if(words[3].equals("5"))
                display.setWorker5Text(line);
            
        }
}

