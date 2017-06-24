import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int h1Sum = 0, h2Sum = 0, h3Sum = 0;
		int h1[] = new int[n1];
		for (int h1_i = 0; h1_i < n1; h1_i++) {
			h1[h1_i] = in.nextInt();
			h1Sum += h1[h1_i];
		}
		int h2[] = new int[n2];
		for (int h2_i = 0; h2_i < n2; h2_i++) {
			h2[h2_i] = in.nextInt();
			h2Sum += h2[h2_i];

		}
		int h3[] = new int[n3];
		for (int h3_i = 0; h3_i < n3; h3_i++) {
			h3[h3_i] = in.nextInt();
			h3Sum += h3[h3_i];
		}

		int i = 0, j = 0, k = 0;
		while (!allThreeEqual(h1Sum, h2Sum, h3Sum)) {
			if (h1Sum >= h2Sum) {
				if (h1Sum >= h3Sum) {
					h1Sum -= h1[i++];
				} else {
					h3Sum -= h3[k++];
				}
			} else {
				if (h2Sum >= h3Sum) {
					h2Sum -= h2[j++];
				} else {
					h3Sum -= h3[k++];
				}
			}
			if ((i >= n1) || (j >= n2) || (k >= n3)) {
				h1Sum = 0;
				break;
			}
		}
		System.out.println(h1Sum);
	}

	public static boolean allThreeEqual(int x, int y, int z) {
		return (x == y) && (y == z);
    }
}