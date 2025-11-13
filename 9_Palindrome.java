class Solution {
    public boolean isPalindrome(int x) {
        int n,rev=0;
        n=x;
        while(n>0){
            int i=n%10;
            rev=rev*10+i;
            n=n/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
        
    }
}