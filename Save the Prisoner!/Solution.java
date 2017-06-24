import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cases = Integer.parseInt(br.readLine());
			String input;
			for (int i = 0; i < cases; i++) {
				String[] arr = br.readLine().split(" ");
				process(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void process(int prisoners, int sweets, int start) {
		int i = sweets <= prisoners ? sweets : sweets - (prisoners - start + 1);
		int j = ((i - 1) % prisoners) + 1;
		System.out.println(j);
	}
}