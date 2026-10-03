class Solution {
    public String defangIPaddr(String address) {
        String b="";
        for(int i=0;i<address.length();i++){
            char san=address.charAt(i);
            if(san=='.'){
                b=b+"[.]";
            }
            else{
                b=b+san;
            }
        }
        return b;
    }
}