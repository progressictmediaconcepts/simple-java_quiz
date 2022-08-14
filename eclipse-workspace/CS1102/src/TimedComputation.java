/**
 * 
 */

/**
 * This program perform some mathematical computations and displays the results.
 * It also displays the value of constant Math.PI. It then reports the time taken
 * in seconds by the computer for the execution of the program.
 */
public class TimedComputation {

	public static void main(String[] args) {
		long startTime; // starting time of program in nanoseconds.
		long endTime; // End time of program in nanoseconds.
		long compTime; // Run time in nanoseconds.
		double seconds; // Time difference, in seconds.
		
		startTime = System.nanoTime();
		
		double width, height, hypothenus; // side of a triangle
		width = 42.0;
		height = 17.0;
		hypothenus = Math.sqrt(width*width + height*height);
		System.out.println("A triangle with sides 42m and 17m has hypothenus of " + hypothenus + "m");
		
		System.out.println("\nMathematically, sin(x)*sin(x) + " + "cos(x)*cos(x) - 1 should be 0.");
		System.out.println("let's check this for x = 100");
		System.out.print("       sin(100)*sin(100) + cos(100)*cos(100) - 1 is: ");
		System.out.println(Math.sin(100)*Math.sin(100) + Math.cos(100) + Math.cos(100) - 1);
		
		System.out.print("\nHere is random number: ");
		System.out.println(Math.random());
		
		System.out.print("\nThe value of Math.PI is ");
		System.out.println(Math.PI);
		
		endTime = System.nanoTime();
		compTime = endTime - startTime;
		seconds = compTime/1000000000.0;
		
		System.out.print("\nRuntime in nanoseconds was: " + compTime + "ns. This is probably not accurate");
		System.out.print("\nRun time in seconds was: " + seconds + "sec.");

	}// end of main

}// end of class
