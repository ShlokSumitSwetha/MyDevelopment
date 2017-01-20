package thread.interrupt;


class waitnotify{
	
	public void produce(){
		synchronized(this){
			try {
				System.out.println("calling wait");
				Thread.currentThread().interrupt();
				wait(1000);
				System.out.println("after called wait()");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void consume(){
		synchronized(this){
			System.out.println("before calling notify");
			notify();
			System.out.println("after calling notify");
		}
		
	}
}



public class ThreadTest4 {

	public static void main(String[] args) {
		waitnotify wn=new  waitnotify();
		wn.produce();
		wn.consume();
		
	}
	
	
}
