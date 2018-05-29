import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Row giriniz:");
		triangle (in.nextInt());
	}
	
	public static void triangle(int k) {
	    int r, num;
	    for (int i = 0; i <= k; i++) {
	        num = 1;
	        r = i + 1;
	        for (int col = 0; col <= i; col++) {
	            if (col > 0) {
	                num = num * (r - col) / col;    
	            }
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}
}
