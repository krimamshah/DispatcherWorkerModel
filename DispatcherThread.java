
/*
 * The DispatcherThread class takes the input and delegates the task to the worker threads.
 * It also creates a fixed pool of threads which can perform the tasks assigned by the dispatcher.
 */

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;


public class DispatcherThread extends Thread {
    
	//Variables

	Runnable worker;
	ExecutorService executor = Executors.newFixedThreadPool(5);
	private final BlockingQueue<String> taskQueue = new LinkedBlockingQueue<String>();
	private boolean empty = true;
	BufferedReader br;
	private String line;
	DispatcherWorkerMain display = new DispatcherWorkerMain();
        
    /**
     * The constructor the BufferReader object which reads the input file.    
     * @param br
     * @throws IOException
     */
	public DispatcherThread(BufferedReader br) throws IOException{
		  this.br = br;
		
	}
	
	
	/**
	 * The method is called when the dispatcher thread is created
	 */
	@Override
	public synchronized void run(){
		
                display.setVisible(true);             // sets the frame visible property to null.
                display.setLocationRelativeTo(null); // sets the frame location at the centre of the screen.
   
		try {
			//if the queue is full the dispatcher sleeps untill the queue gets empty
		while(!empty){
			System.out.println("I am sleeping");
			wait();
		}
		
		//when the queue gets empty it puts the task in the blocking queue and wakes up the sleeping worker threads.
		empty = false;       
		notify();
                   
		line = br.readLine();
	    while(line!=null){	
			taskQueue.put(line);                      //put the task in the queue
            display.setDispatcherText(line+"\n");     //display the blocking queue
			Thread.sleep(1000);
                        
			worker = new WorkerThread(taskQueue,display);  //create the worker thread
                       
			executor.execute(worker);                     //execute the worker thread
                        
			line = br.readLine();
		}
		
		
	executor.shutdown();                                //initiates shutdown in which previously submitted tasks are executed, but no new tasks will be accepted
	
	//Blocks until all tasks have completed execution after a shutdown request, 
	//or the timeout occurs, or the current thread is interrupted, whichever happens first
	executor.awaitTermination(5000,TimeUnit.MILLISECONDS);
	
	} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
		
	}
        
	
        }
    

