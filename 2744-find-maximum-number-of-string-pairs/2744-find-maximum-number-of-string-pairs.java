class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
          int n=0;
          for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=i+1;j<words.length;j++){
                String c=words[j];
               if(s.charAt(0)==c.charAt(1) && s.charAt(1)==c.charAt(0)){
                n++;
               }
            }
          }
          return n;
    }
}