class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> san=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if(s.equals("+")){
                int t=san.pop();
                int t1=san.peek();
                int ans=t+t1;
                san.push(t);
                san.push(ans);
            }
            else if(s.equals("D")){
                int t2=san.pop();
                int an=t2*2;
                san.push(t2);
                san.push(an);
            }
            else if(s.equals("C")){
                san.pop();
            }
            else{
                san.push(Integer.valueOf(s));
            }
        }
        int las=0;
        for(int i:san){
            las+=i;
        
    }
    return las;
}
}