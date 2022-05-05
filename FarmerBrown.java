public class FarmerBrown {
	public static void main(String[] args) {
		for (int s = 1 ; s <= 100 ; s++) {
			for (int g = 1 ; g <= 100; g++) {
				for (int c = 1 ; c <= 100 ; c++) {
					if (s+g+c == 100 && 10.00*s + 3.50*g + 0.50*c == 100.00) {
						System.out.print(s + " sheep, ");
						System.out.print(g + " goats, and ");
						System.out.println(c + " chickens.");
					}
				}
			}
		}
	}
}