package thread.interrupt;


class Thread1 implements Runnable{

	@Override
	public void run() {
		while(true){
			System.out.println("thread 1 executing");
			if(Thread.currentThread().isInterrupted()){
				System.out.println("Thread is interrupted");
				System.out.println("returning out of run");
				return;
			}
		}
	}
}


class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread2 running");
		
	}
	
}


public class ThreadTest5 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread1=new Thread(new Thread1(), "thread1");
		Thread thread2=new Thread(new Thread2(), "thread2");
		
		thread1.start();
		thread1.interrupt();
		thread2.start();
	}

	
}
