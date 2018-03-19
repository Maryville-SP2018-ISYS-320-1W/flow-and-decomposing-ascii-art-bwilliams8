/*
  	ISYS 320
  	Name(s): Brian Williams
  	Date: 
*/

// 1. Your predicted output 

// Based mostly on my swift knowledge:
// message1 and message2 are functions / methods. message1 prints "This is message1" to console then returns, while message2 prints "This is message2.", followed by calling message1, then printing "Done with message 2."
// The console output would be:
/*
This is message1.
This is message2.
This is message1.
Done with message 2.
Done with main.
*/
 

public class Tricky {
	    public static void main(String[] args) {
	        message1();
	        message2();
	        System.out.println("Done with main.");
	    }
	    
	    public static void message1() {
	        System.out.println("This is message1.");
	    }
	    
	    public static void message2() {
	        System.out.println("This is message2.");
	        message1();
	        System.out.println("Done with message 2.");
	    }


}

// 3. Were you correct? Explain any differences

// I was correct.
 
 

