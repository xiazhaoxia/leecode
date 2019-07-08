class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {        
        List<Integer> ls=new ArrayList<>();
        for(int i=A.length-1;i>=0;i--){
            ls.add(0,(A[i]+K)%10);
            K=(A[i]+K)/10;
        }
        while(K>0){
            ls.add(0,K%10);
            K=K/10;
        }
        return ls;
    }
}