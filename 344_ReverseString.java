class Solution {
    public void reverseString(char[] s) {
        char[] rev=new char[100];
        for(int i=s.length-1;i>=1;i--){
            rev[i]=s[i];
        }
        System.out.println(rev);
    }
}