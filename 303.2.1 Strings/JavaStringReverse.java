import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String sameOrNot = "Yes";
        for (int i = 0; i < A.length(); i++){
            String frontChar = A.substring(i, i+1);
            String backChar = A.substring(A.length()-1-i, A.length()-i);
            if (frontChar.compareTo(backChar)!=0){
               sameOrNot = "No";
               break;
            }
        } //forloop
        System.out.println(sameOrNot);
    }//main
}//class



