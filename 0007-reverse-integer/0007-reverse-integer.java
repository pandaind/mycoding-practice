class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        
        x = isNegative ? -x : x;
        
        int revInt = 0;
        int prevInt = 0;
        while(x!=0){
            int currentDigit = x % 10;
            
            revInt = revInt * 10 + currentDigit;
            
            if(((revInt-currentDigit)/10) != prevInt)
                return 0;
            
            prevInt = revInt;
            x = x / 10;
        }
        
        return isNegative ? -revInt : revInt;
    }
}