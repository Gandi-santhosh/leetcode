class Solution {
    public int countGoodSubstrings(String s) {
         
        int l=0;int n=s.length();
        int countGoodSubstrings=0;
        for(int r=0;r<=n-3;r++){
            String temp=s.substring(r,r+3);
            for(int i=0;i<temp.length();i++){
                System.out.print(temp.charAt(i));
              }
              if(temp.charAt(0) != temp.charAt(1) &&
   temp.charAt(0) != temp.charAt(2) &&
   temp.charAt(1) != temp.charAt(2)) {
      countGoodSubstrings++;
            }
            
            System.out.println();
        }
        
        return countGoodSubstrings;
    }
}