package thread.creation;

public class ThreadImplements implements Runnable{

	public static void main(String[] args) {
		
		// give runnable interface instance to thread constructor and start the thread
		new Thread(new ThreadImplements()).start();
	}

	@Override
	public void run() {
		System.out.println("thread running");		
	}

}
