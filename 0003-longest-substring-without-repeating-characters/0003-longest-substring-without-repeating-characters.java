class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;int ans=0;int n=s.length();
        HashSet<Character> san=new HashSet<>();
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            if(!san.contains(ch)){
                san.add(ch);
            }
            else{
                while(san.contains(ch)){
                    san.remove(s.charAt(l));
                    l++;
                }
                san.add(ch);
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}