class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++){
             int b=s.charAt(i-1);
            int k=s.charAt(i);
            int l=Math.abs(k-b);
            sum=sum+l;
            
        }
        return sum;
    }
}