class Solution {
    public int numJewelsInStones(String J, String S) {
        int sum=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(map.containsKey(c)){
                
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
               
        for(int j=0;j<J.length();j++){
            if(map.containsKey(J.charAt(j))){
                sum+=map.get(J.charAt(j));
            }
        }
               
        return sum;
    }
}