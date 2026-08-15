class Solution {
    public boolean isPossible(int[] position, int m,int force){
        int j=position[0];
        m-=1;
        for(int i=1;i<position.length;i++){
            int val=position[i];
            if(val-j>=force){
                  j=position[i];
                  m-=1;

            }
            if(m<=0){
                return true;
            }
        }
        return false;

    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1;int r=(int)Math.pow(10,9);
        while(l<=r){
            int force=l+(r-l)/2;
            if(isPossible(position,m,force)){
                l=force+1;
            }
            else{
                r=force-1;
            }
        }
        return r;
    }
}