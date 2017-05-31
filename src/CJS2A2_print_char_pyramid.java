
public class CJS2A2_print_char_pyramid {
	public static void main (String s[]){
		
		char center_char = 'e'; // Just set this center_char to any lowercase char and see the pattern.
		
		char start = 'a'; int spaces = center_char - (int) 'a';
		
	    while( start < center_char) {

	        // Print the left side spaces
	        for( int i = 0; i < spaces; i++)
	            System.out.print(" ");

	        // Print the left side characters (including center char) 
	        for( char y = 'a'; y <= start; y++)
	            System.out.print(y);

	        // Print the right side characters (after center char) 
	        for( char y = (char)(start - 1); y >= 'a'; y--)
		           System.out.print(y);

	        // Print the right side spaces
	        for (int i = 0; i < spaces; i++)
	            System.out.print(" ");

	        // Print a new line
	        System.out.println();

	        // Subtract 1 from the number of spaces we need
	        spaces--; 

	        // Increment the start character
	        start++;
	    }
	    
	    while( start >= 'a') {

	        // Print the left side spaces
	        for( int i = 0; i < spaces; i++)
	            System.out.print(" ");

	        // Print the left side characters (including center char)
	        for( char y = 'a'; y <= start; y++)
	            System.out.print( y);

	        // Print the right side characters (after center char)
	        for( char y = (char)(start - 1); y >= 'a'; y--)
	            System.out.print( y);

	        // Print the right side spaces
	        for (int i = 0; i < spaces; i++)
	            System.out.print(" ");

	        // Print a new line
	        System.out.println();

	        // Increment spaces by 1 
	        spaces++; 

	        // Decrement the start character
	        start--;
	    }
	}

}
