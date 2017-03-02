package thread.interrupt;


class ThreadTest implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread running"+Thread.currentThread().getName());
		while(true){
			if(Thread.currentThread().isInterrupted()){
				System.out.println("thread interrupted");
				return;
			}
		}
	}
	
}



public class ThreadTest6 {

	public static void main(String[] args) {
		Thread thread1=new Thread(new ThreadTest(),"thread1");
		
		thread1.start();
		Thread.currentThread().interrupt();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
