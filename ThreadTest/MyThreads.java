package ThreadTest;
import java.util.ArrayList;
public class MyThreads extends Thread {

	  private String threadName;
	  int start, end;
	    
	  static ArrayList<Integer> primenumbers = new ArrayList<>();
	    
	    public MyThreads(String threadName, int start, int end) {
	        super(threadName);
	        this.start = start;
	        this.end = end;
	        this.threadName = threadName;

	    }
	    
	    public static ArrayList<Integer> getResult(){
	        return primenumbers;
	    }

	    
	    
	    public void run(){

	        for(int i = this.start; i <= this.end; i++) {
	            int count =0;
	            for(int j=1;j<=i;j++){
	                if(i%j==0){
	                    count++;
	                }
	            }
	            if(count==2){
	                this.primenumbers.add(i);
	            }
	         }

	    }

}
