
public class DSFUNIT2 {

	public static void main(String[] args) {
		int x = 2;   // variable x is declared and initialized with a value of "2".
		
		// Using while loop to set the number of iteration.
		while (x <= 10) {
			if (x % 2 == 0) {
				System.out.println(x);  // result if x is an even number.
			} else {
				System.out.println(x + 3);  // result if x is odd number.
			}
			x++;   // x is incremented by 1 after each execution it reach 10.
		} // end of while block
		System.out.println("This is the end of while loop 1");
		System.out.println("This is the begining of do..while loop 1");
		
		
		// Computing the above program using do...while loop;
		int y = 2;
		
		do {
			if (y % 2 == 0) {
				System.out.print(y);
			} else {
				System.out.print(y + 3);
			}
			y++;
		}while (y <= 10); // end of do...while
		System.out.println("This is the end of do...while loop 1");
		System.out.println("This is the begining of for loop 1");
		
		
		// Computing the above program using for loop.
		
		for (int z = 2; z <= 10; z++) {
			if (z % 2 == 0) {
				System.out.print(z);
			} else {
				System.out.print(z + 3);
			}
		}
		System.out.println("This is the end of for loop 1");
		System.out.println("This is the begining of do..while loop 2");
		
		
		// Section starting with do...for loop.
		
		int a = 1; // variable a is declared and initialized with a value of "1".
		do {
			System.out.println(a); // "a" should be printed to the console.
			a++;     // "a" should be incremented by 1
		}while (a <= 10);  // the condition for the execution and stoppage of System.out.print(a) statement.
		System.out.println("This is the end of do..while loop 2");
		System.out.println("This is the begining of while loop 2");
		
		// using while loop to compute the same program above.
		
		int b = 1;
		while(b <= 10) {
			System.out.println(b);
			b++;
		}
		System.out.println("This is the end of while loop 2");
		System.out.println("This is the begining of for loop 2");
		
		// Using for loop for the computation.
		for(int c = 1; c <= 10; c++) {
			System.out.println(c);
		}
		System.out.println("This is the end of while loop 2");
		System.out.println("This is the begining of for loop 3");
		
		// section starting with for loop.
		
		String planet = "Neptune";
		for(int i = 0; i < planet.length(); i++) {
			System.out.println(planet.charAt(i));
		}
		System.out.println("This is the end of for loop 3");
		System.out.println("This is the begining of while loop 3");
		
		// Using while loop for the computation of the above program
		String body = "Neptune";
		int i = 0;
		while(i < body.length()) {
			System.out.println(body.charAt(i));
			i++;
		}
		System.out.println("This is the end of while loop 3");
		System.out.println("This is the begining of do...while loop 3");
		
		// Using do...while loop for the computation of above program.
		
		String heavenlyBody = "Neptune";
		int j = 0;
		do {
			System.out.println(heavenlyBody.charAt(j));
			j++;
		}while(j < heavenlyBody.length());
		
	} // end of main

} // end of class

