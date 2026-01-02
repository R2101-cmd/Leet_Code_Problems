class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        boolean flag=false;
        char[] ch=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]!=' '){
                flag=true;
                count++;
            }
            else if(flag){
                break;
            }  
        }
        return count;
    }
}