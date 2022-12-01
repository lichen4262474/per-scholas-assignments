import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] inputArray = new int [n];
        for (int i = 0; i < n; i++){
            inputArray[i] = input.nextInt();
        }//close forloop from line 14
        int count=0;
        for (int startIndexControl = 0; startIndexControl < n; startIndexControl++){
            int sum = 0;
    for (int i = startIndexControl; i < n; i++){
        sum+=inputArray[i];
        if (sum < 0){
            count++;
        }//close if
    }        //close inner loop    
        }//close outer loop
        
        System.out.println(count);
    }//close main
}//close class
