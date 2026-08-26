class Solution {
    public String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        StringBuilder str = new StringBuilder(s);
        while(i<j){
            while(i<s.length() && !isNot(s.charAt(i))){
                i++;
            }
            while(j>=0 && !isNot(s.charAt(j))){j--;}
            if(i>j) break;
            char temp=s.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
            i++;
            j--;
        }
        return str.toString();
    }
    boolean isNot(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
}