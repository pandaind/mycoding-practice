class Solution {
    public String reverseVowels(String s) {
        List<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('e');
        chars.add('i');
        chars.add('o');
        chars.add('u');
        chars.add('A');
        chars.add('E');
        chars.add('I');
        chars.add('O');
        chars.add('U');


        char[] sarr = s.toCharArray();

        int l = sarr.length;
        int i=0, j = l-1;

        while(j > i){
            if(!chars.contains(sarr[i])){
                i++;
            }else if(!chars.contains(sarr[j])){
                j--;
            } else {
                char temp = sarr[j];
                sarr[j] = sarr[i];
                sarr[i] = temp;
                i++;
                j--;
            }
        }

        return new String(sarr);
    }
}