package sleep.test;

class SleepRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("thread is executing");
		String importantInfo[] = {
	            "Mares eat oats",
	            "Does eat oats",
	            "Little lambs eat ivy",
	            "A kid will eat ivy too"
	        };

	      for(int i=0;i<10;i++){
	            //Pause for 4 seconds
	            try {
					Thread.sleep(1000);
					System.out.println("thread is slept="+Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	            //Print a message
	            System.out.println("running");
	        }
	}
	
}




public class SleepTest {

	public static void main(String[] args) {
		System.out.println("sleep testing");
		SleepRunnable runnable =new SleepRunnable();
		Thread t=new Thread(runnable,"threadone");
		t.start();;
		new Thread(runnable,"threadtwo").start();;
		
		}
		
		    }	

	


