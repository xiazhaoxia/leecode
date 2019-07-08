class Solution {
    public int[] sortedSquares(int[] A) {
        int start=0;
        int end=A.length-1;
        int[] B=new int[A.length];
        int p=B.length-1;
        while(start<=end){
            if(A[start]*A[start]>=A[end]*A[end]){
                B[p]=A[start]*A[start];
                start++;
            }else{
                B[p]=A[end]*A[end];
                end--;
            }
            p--;
        }
        return B;
    }
}