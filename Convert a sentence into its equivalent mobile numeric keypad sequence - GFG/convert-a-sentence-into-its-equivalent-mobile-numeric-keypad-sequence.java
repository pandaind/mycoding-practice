//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        String[] keypad = {"2","22","222","3","33","333","4","44","444",
           "5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
           
        StringBuilder sb = new StringBuilder();
        
        S.chars().forEach(ch ->{
            if(ch == ' '){
                sb.append("0");
            }else{
                int idx = ch - 'A';
                sb.append(keypad[idx]);
            }
        });
        
        return sb.toString();
    }
}