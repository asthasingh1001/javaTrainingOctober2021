package ThreadTest;


public class MultiThreading {
	 public static void main(String[] args) {
	        MyThreads t1 = new MyThreads("Thread-1", 1, 50000);
	       
	        t1.start();
	        

	        long startTime = System.currentTimeMillis();

	        try {
	            t1.join();  
	            
	        } catch (Exception e) {
	            //TODO: handle exception
	        }
	        
	        System.out.println(t1.getResult());
	        long endTime = System.currentTimeMillis();
	        long elapsedTime = endTime - startTime;
	        System.out.println("TotalTime: "+elapsedTime+" Milliseconds");
}
}