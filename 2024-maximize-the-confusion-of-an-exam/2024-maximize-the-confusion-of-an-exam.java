class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l=0;int ans=0;int que=0;int n=answerKey.length();int max=0;
        for(int r=0;r<n;r++){
            if(answerKey.charAt(r)=='F'){
                ans++;
            }
            if(answerKey.charAt(r)=='T'){
                que++;
            }
            while(ans>k && que>k){
                if(answerKey.charAt(l)=='F'){
                    ans--;
                }
                if(answerKey.charAt(l)=='T'){
                    que--;
                }
                l++;
            }
           max=Math.max(max,r-l+1); 
        }
        return max;

    }
}