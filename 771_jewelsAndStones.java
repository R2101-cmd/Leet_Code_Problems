class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char[] c1=jewels.toCharArray();
        char[] c2=stones.toCharArray();
        for (int i=0;i<c1.length;i++){
            for(int j=0;j<c2.length;j++){
                if (c1[i]==c2[j]){
                    count++;
                }
                
            }
            
        }
        return count;
    }
}