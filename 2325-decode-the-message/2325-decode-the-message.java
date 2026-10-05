class Solution {
    public String decodeMessage(String key, String message) {
      int ans=97;
      HashMap<Character,Character> san=new HashMap<>();
      for(int i=0;i<key.length();i++){
        char temp=key.charAt(i);
        if(temp!=' ' && !san.containsKey(temp)){
            san.put(temp,(char)ans);
            ans++;
        }
      }
      String s="";
      for(int i=0;i<message.length();i++){
        if(message.charAt(i)!=' '){
            char c=san.get(message.charAt(i));
            s=s+c;
        }
        else{
            s=s+" ";
        }

      }
      return s;
    }
}