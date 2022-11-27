//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        Set<Character> res = new TreeSet<>();
        
        for(Character ch: A.toCharArray()){
            if(!B.contains(ch.toString())){
                res.add(ch);
            }
        }
        
        for(Character ch: B.toCharArray()){
            if(!A.contains(ch.toString())){
                res.add(ch);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        res.forEach(ch->sb.append(ch));
        
        return sb.length()<=0?
                        "-1"
                        :sb.toString();
    }
}