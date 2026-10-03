class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int sum=0;
         for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                String c=words[j];
                String rev="";
                for(int k=c.length()-1;k>=0;k--){
                  rev=rev+c.charAt(k);
                }
                if(words[i].equals(rev)){
                    sum++;
                }
            }
        }
        return sum;
    }
}