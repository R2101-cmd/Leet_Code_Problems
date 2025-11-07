class Solution {
    public int numIdenticalPairs(int[] n) {
        int count=0;
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]==n[j]){
                    count++;
                }
            }
        }
        return count;
    }
}