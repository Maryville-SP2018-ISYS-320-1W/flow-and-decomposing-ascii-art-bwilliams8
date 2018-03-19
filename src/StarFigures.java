/*
  	ISYS 320
  	Name(s): Brian Williams
  	Date: 
*/

// 4. Your pseudocode algorithm for how to break down the figure
/*
Three base variables:
*****
 * *
  *

Beyond this, seperate methods to call them in different orders.

 */


public class StarFigures {

	static String fiveStar = "*****";
	static String twoStar = " * * ";
	static String oneStar = "  *  ";
	static String milhouseString = "Milhouse did not test cootie positive.";
	
	public static void main(String[] args) {
		starDesignOne();
		starDesignTwo();
		starDesignThree();
		milhouse();
	}
	
    public static void starDesignOne() {
        System.out.println(fiveStar + '\n' + fiveStar + '\n' + twoStar + '\n' + oneStar + '\n' + twoStar);
    }
    
    public static void starDesignTwo() {
    	System.out.println(fiveStar +'\n' + fiveStar + '\n' + twoStar + '\n' + oneStar + '\n' + twoStar + '\n' + fiveStar + '\n' + fiveStar);
    }
    
    public static void starDesignThree() {
    	System.out.println(oneStar + '\n' + oneStar + '\n' + oneStar + '\n' + fiveStar + '\n' + fiveStar + '\n' + twoStar + '\n' + oneStar + '\n' + twoStar);
    }
	
    public static void milhouse() {
    	String milhouse1000;
    	milhouse1000 = new String(new char[1000]).replace("\0", milhouseString + '\n');
    	System.out.println(milhouse1000);
    }

}
