public class NumbersAndMath {

	public static void main (String[] args) {

	// 7.0 / 4.0 and compare it to 7 / 4

	// line printing out the "meaning" of the following values
	System.out.println("I will now count my chickens: ");
	
	// adds 25 to result of 30 divided by 6
	System.out.println("Hens " + (7.0 / 4.0) );
	
	//answer is 97
	System.out.println("Roosters " + (7 / 4));
	// line printing out the "meaning" of the following values
	
	System.out.println("Now I will count the eggs");
		
	// answer is 7
	System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + (4.0 % 2.0) - (1.0 / 4.0) + 6.0);
	
	// prints line asking if 5 is less than -2
	System.out.println("Is it true that 3 + 2 < 5 + 7?");
	
	// boolean check
	System.out.println( 3 + 2 < 5 - 7);

	// 2 lines printing out the results of 3 + 2 and 5 - 7, respectively
	System.out.println("What is 3 + 2? " + (3 + 2));	
	System.out.println("What is 5 - 7? " + (5 - 7));

	//  
	System.out.println("Oh, that's why it's false.");

	//
	System.out.println ("How about some more.");

	// true or false tests
	System.out.println("Is 5 > -2? " + ( 5 > -2 ) );
	System.out.println("Is it greater or equal? " + ( 5 >= -2 ));
	System.out.println("Is it less or equal? " + ( 5 <= -2) );

}
}