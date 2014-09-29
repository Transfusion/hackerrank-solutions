import java.io.*;
import java.util.*;
import java.lang.Math;

class Solution {
	public static void main (String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCases = Integer.parseInt(br.readLine());
			for (int i=0;i<testCases;i++){
				String testCase__ = br.readLine();
				List<String> testCase_ = Arrays.asList(testCase__.split(" "));
				List<Integer> testCase = new ArrayList<Integer>();
				for (String str : testCase_) {
          			testCase.add(Integer.parseInt((String)str));
        		}
        		double count = Math.floor(Math.sqrt(testCase.get(1)))-Math.ceil(Math.sqrt(testCase.get(0)))+1;
        		System.out.printf("%d\n", (int)count);
			}
		}
		catch (IOException io){
			io.printStackTrace();
		}
   }
}
