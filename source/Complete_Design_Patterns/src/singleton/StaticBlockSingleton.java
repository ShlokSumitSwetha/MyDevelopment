package singleton;

public class StaticBlockSingleton {
	 
    private static StaticBlockSingleton instance;
     
    private StaticBlockSingleton(){}
     
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
     
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}

/* Both eager initialization and static block initialization 
creates the instance even before it’s being used and 
that is not the best practice to use. 
*/