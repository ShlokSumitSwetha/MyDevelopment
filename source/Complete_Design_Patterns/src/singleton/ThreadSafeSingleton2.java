package singleton;

public class ThreadSafeSingleton2 {
	 
    private static ThreadSafeSingleton2 instance;
     
    private ThreadSafeSingleton2(){}
     
    public static ThreadSafeSingleton2 getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton2();
                }
            }
        }
        return instance;
    }
}
/*In this approach, the synchronized block is used inside the 
if condition with an additional check to ensure that only one 
instance of singleton class is created.*/