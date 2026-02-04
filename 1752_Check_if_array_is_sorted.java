class Solution {
    public boolean check(int[] n) {
        int count=0;
        int len=n.length;
        if(len<=1) return true;
        for(int i=0;i<len;i++){
            if(n[i]>n[(i+1)%len]){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}