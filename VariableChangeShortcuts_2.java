public class VariableChangeShortcuts_2 {
	public static void main ( String[] args ) {
		int i, j, k;

		i = 5;
		j = 5;
		k = 5;
		System.out.println ( "i: " + i + "\tj: " + j + "\tk: " + k );
		i = i + 3;
		j = j - 3;
		k = k * 3;
		System.out.println ( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

		i = 5;
		j = 5;
		k = 5;
		// Compound Assignment Operator
		System.out.println ( "i: " + i + "\tj: " + j + "\tk: " + k );
		i += 3; // i = i + 3 (i plus equals 3)
		j -= 3; // j = j - 3 (i minus equals 3)
		k *= 3; // k = k * 3 (k multiply equals 3)
		System.out.println ( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

		i = j = k = 5; // i=5, j=5, k=5
		System.out.println ( "i: " + i + "\tj: " + j + "\tk: " + k );
		i += 1; // i = i + 1
		j -= 2; // j = j - 2
		k *= 3; // k = k * 3
		System.out.println ( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

		i = j = 5;
		System.out.println ( "i: " + i + "\tj: " + j );
		i =+ 1; // set i equal to positive 1
		j =- 2; // set j equal to negative 2
		System.out.println ( "i: " + i + "\tj: " + j + "\n" );

		i = j = 5;
		// Post-Increment Operator
		System.out.println ( "i: " + i + "\tj: " + j );
		i++; // i = i + 1 or i += 1
		j--; // j = j - 1 or j -= 1
		System.out.println ( "i: " + i + "\tj: " + j + "\n" );

		// Drill 1
		i = 5;
		System.out.println ( "i: " + i );
		i -= 5; // i = i - 5
		System.out.println ( "i: " + i + "\n" );

		// Drill 2
		i = 5;
		System.out.println ( "i: " + i );
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println ( "i: " + i );

	}
}