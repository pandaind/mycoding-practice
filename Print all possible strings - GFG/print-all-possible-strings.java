//{ Driver Code Starts
import java.util.*;


class Find_All_Possible_Strings
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			ArrayList<String> arr = g.spaceString(str);
			for(String s : arr){
			    System.out.print(s+"$");
			}
            System.out.println();
			t--;
		}
	}
}
// } Driver Code Ends


/*You have to complete this function*/
class GfG
{
    ArrayList<String> spaceString(String str)
    {
       String res = str.substring(0,1);
       String input = str.substring(1, str.length());
       ArrayList<String> result = new ArrayList<>();
       
       solve(res, input, result);
       
       return result;
    }
    
    void solve(String res, String input, ArrayList<String> result)
    {
        if(input == null || input.length() == 0){
            result.add(res);
            return;
        }
        solve(res+input.substring(0,1), input.substring(1, input.length()), result);
        solve(res+" "+input.substring(0,1), input.substring(1, input.length()), result);
    }
}
