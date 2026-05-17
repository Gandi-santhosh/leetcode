class Solution {
    public int[] replaceElements(int[] arr) {
        
       int n=arr.length;
       for(int i=0;i<n;i++){
           int a=-1;
           for(int j=i+1;j<n;j++){
               a=Math.max(a,arr[j]);
           }
          arr[i]=a;
       }
      return arr;
    }
}