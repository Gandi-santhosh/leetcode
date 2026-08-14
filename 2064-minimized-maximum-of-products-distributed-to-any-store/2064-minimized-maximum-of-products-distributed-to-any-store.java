class Solution {
    public boolean isPossible(int n, int[] quantities,int k){
        int temp=0;
         for(int i=0;i<quantities.length;i++){
                int val=quantities[i];
                temp=val/k;
                if(val%k!=0){
                    temp++;
                }
                n-=temp;
                if(n<0){
                    return false;
                }
         }
         return true;
        
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;int r=(int)Math.pow(10,5);
        while(l<=r){
            int k=l+(r-l)/2;
            if(isPossible(n,quantities,k)){
                r=k-1;
            }
            else{
                l=k+1;
            }
        }
        return l;
    }
}