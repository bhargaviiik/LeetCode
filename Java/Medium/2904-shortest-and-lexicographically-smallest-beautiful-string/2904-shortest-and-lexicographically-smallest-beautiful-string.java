class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i=0, j=0;
        String ans="";
        int req=0;
        while(j<s.length()){
            if(s.charAt(j)=='1') req++;
            while(req==k){
                String str= s.substring(i,j+1);
                if(ans.length()==0 || str.length()< ans.length()){
                    ans=str;
                }
                else if( str.length()==ans.length() && (ans.compareTo(str)>0)) ans=str;
                if(s.charAt(i)=='1') req--;
                while(++i<s.length() && s.charAt(i)!='1');
            }
            j++;
        }
        return ans;
    }
}