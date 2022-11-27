//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
      
        String first = arr[0];
        String last = arr[arr.length-1];
        
        for(int i=0,j=0;i<first.length()&&j<last.length();i++,j++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            sb.append(first.charAt(i));
        }
        return sb.length()>0?sb.toString():"-1";
    }
}