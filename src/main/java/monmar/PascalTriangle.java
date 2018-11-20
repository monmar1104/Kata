package monmar;

public class PascalTriangle {

	public static void main(String[] args) {
		int power = 6;
		int[][] pascalTable = new int[power+1][power + 1];

		for (int i = 0; i <= power; i++) {
			for (int k = 0; k <= i; k++) {
				if (k == 0) {
					pascalTable[i][k] = 1;
				} 
				else if (k == i + 1) {
					pascalTable[i][k] = 1;
				} 
				else {
					pascalTable[i][k] = pascalTable[i - 1][k - 1] + pascalTable[i - 1][k];
				}
			}
		}

		for (int j = 0; j <= power; j++) {
			for (int l = 0; l <= j; l++) {
				if (l == j) {
					System.out.println(pascalTable[j][l]);
				} else {
					System.out.print(pascalTable[j][l]+" ");
				}

			}
		}

	}
}
