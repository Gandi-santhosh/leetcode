class Solution {
    public boolean isPossible(int[] bloomday,int m,int k,int s){
        int take=0;
        for(int i=0;i<bloomday.length;i++){
            if(bloomday[i]<=s){
                take+=1;;
            }
            else{
                take=0;
            }
            if(take==k){
                m-=1;take=0;
            }
            if(m==0){
                return true;
            }
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l=1;int r=(int)Math.pow(10,9);
        while(l<=r){
            int s=l+(r-l)/2;
            if(isPossible(bloomDay,m,k,s)){
                r=s-1;
            }
            else{
                l=s+1;
            }
        }
        int exed=(int)Math.pow(10,9);
        if(l==exed+1){
            return -1;
        }
        return l;
    }
}