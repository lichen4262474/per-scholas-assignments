import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        for(int i = 0; i < s.length()+1-k; i++){
            String flagString = s.substring(i, i+k);
            if (flagString.compareTo(smallest)<0){
                smallest = flagString;
            }
            else if (flagString.compareTo(largest)>0){
                largest = flagString;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

