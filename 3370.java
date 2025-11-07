class Solution {
    public int smallestNumber(int n) {
        int x=0;
        int k=1;
        while(true){
            x=(int)Math.pow(2,k)-1;
            if (x>=n){
                return x;
                
            }
            k=k+1;
        }
        
    }
}