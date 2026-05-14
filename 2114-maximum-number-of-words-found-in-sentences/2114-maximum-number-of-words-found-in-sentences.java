class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=0;
        for(int i=0;i<sentences.length;i++){
            String temp=sentences[i];
            int s=1;
            for(int j=0;j<temp.length();j++){
                if(temp.charAt(j)==' '){
                    s++;
                }

            }
            n=Math.max(n,s);
        }
        return n;
    }
    
}