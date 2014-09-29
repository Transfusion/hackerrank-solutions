import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String item = br.readLine();
            br.readLine();
			String ar = br.readLine();
            List<String> arList = Arrays.asList(ar.split(" "));
            System.out.println(arList.indexOf(item));
            
        }
		catch (IOException io){
			io.printStackTrace();
		}
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
