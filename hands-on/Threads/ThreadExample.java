package corejava;
//Create threads by extending Thread class

public class ThreadExample {
	//Initiated run method for thread
    public void run() {
        System.out.println("Thread started running.");
    }

 

    public static void main(String[] args) {
        
        ThreadExample th = new ThreadExample();
        // Invoking Thread 
        th.start();
        
    }



	private void start() {
		// TODO Auto-generated method stub
		
	}

 

}

