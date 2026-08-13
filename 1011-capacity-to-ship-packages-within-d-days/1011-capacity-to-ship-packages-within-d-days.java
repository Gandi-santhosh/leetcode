class Solution {
    public static boolean isPossible(int[] weights, int days,int load){
             int temp=0;int n=0;
        for(int i=0;i<weights.length;i++){
            int val=weights[i];
            if(val>load){
                return false;
            }
            if(temp+val>load){
                
                temp=weights[i];
                days-=1;
            }
            else{
                temp+=val;
            }
            
            
            if(days<=0){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=1;int r=Integer.MAX_VALUE;
        while(l<=r){
            int load=l+(r-l)/2;
            if(isPossible(weights,days,load)){
                r=load-1;

            }
            else{
                l=load+1;
            }
        }
        return l;
    }
}