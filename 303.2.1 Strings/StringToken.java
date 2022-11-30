import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String[] tokenArray = s.split("[ !,?._'@]");
        int tokenCount = 0;
        String outPutString = "";
        for(String each : tokenArray){
            if (each.compareTo("")!=0){
            tokenCount++;
            outPutString += each + "\n";    
            }//endif
        }//end for
        System.out.println(tokenCount);
        System.out.println(outPutString.substring(0, outPutString.length()-1));
        
        }//end main
        
        
    }//end class