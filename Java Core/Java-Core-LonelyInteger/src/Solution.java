import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int lonelyinteger(int[] arr) {
    	int result=0;
    	for (int i = 0; i < arr.length; i++) {
            boolean singleInteger = true;
            for (int j = 0; j < arr.length; j++) {
                if (j == i) {
                    continue;
                }
                if (arr[j] == arr[i]) {
                    singleInteger = false;
                    break;
                }
            }

            if (singleInteger) {               
            	result =arr[i];
                break;
            }
        }
    	return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lonelyinteger(a);
        System.out.println(result);
    }
}
