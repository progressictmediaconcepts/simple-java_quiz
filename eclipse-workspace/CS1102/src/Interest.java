/**
 * This class implements a simple program that will
 * compute the amount of interest that is earned on $17,000 invested at 
 *an interest rate of 0.027 for one year. The interest and the value of the 
 *investment after one year are printed to standard output
 */

public class Interest {
	public static void main(String[] args) {
		/* variables are declared */
		double principal = 17000;
		double rate = 0.027;
		double interest = principal * rate;
		principal = principal + interest; // Principal reassigned  for investment after one year.
		
		// Output results
		System.out.print("The interest earned is $ " );
		System.out.println(interest);
		System.out.print("The value of the investment after one year is $ " + principal);
	} // end of main.

}// end of class.
