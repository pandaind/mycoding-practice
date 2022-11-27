//{ Driver Code Starts
//saksham raj seth
import java.util.*;
class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
        {
        Map<Character, Integer> reg = new HashMap<>();
        
        for(Character ch: s.toCharArray()){
            reg.put(ch, 1 + reg.getOrDefault(ch,0));
        }

        for(Character ch: s1.toCharArray()){
            reg.put(ch, -1 + reg.getOrDefault(ch,0));
        }
        
        return (int) reg.values().stream()
                .reduce(0, (r,v) -> r + Math.abs(v));
        }
}