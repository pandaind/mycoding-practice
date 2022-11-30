//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> setRes = new HashSet<>();
        
        for(int i=0; i<arr.length; i++){
            if(!set.add(arr[i])){
                setRes.add(arr[i]);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>(setRes);
        
        Collections.sort(result);
        
        if(result.isEmpty())
            result.add(-1);
        
        return result;
    }
}
