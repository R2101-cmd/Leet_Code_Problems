class Solution {
    public int totalMoney(int n) {
        int f=n/7;
        int r=n%7;
        int sum=0;
        if (n<=7){
            for(int i=1;i<=n;i++){
                sum=sum+i;
            }
        }
        else{
            for (int week = 0; week < f; week++) {
                int weekStart = week + 1; 
                for (int day = 0; day < 7; day++) {
                    sum += weekStart + day;
                }
            }
            int nextWeekStart = f + 1;
            for (int day = 0; day < r; day++) {
                sum += nextWeekStart + day;
            }
          
        }
        return sum;
    }
}