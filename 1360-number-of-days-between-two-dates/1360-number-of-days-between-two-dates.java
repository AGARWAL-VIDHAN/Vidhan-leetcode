class Solution {
    private int getdays(int year,int month,int day,int[] arr){
        int total=day;
        for(int i=1;i<month;i++){
            total+=arr[i-1];
            if(i==2 && isLeapYear(year)){
                total+=1;
            }
        }
        return total;
    }
    private boolean isLeapYear(int i){
        if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)){
            return true;
        }
        return false;
    }
    private int daysFromDate(String date1, String date2, int[] arr) {
        int year1 = Integer.parseInt(date1.substring(0, 4));
        int year2 = Integer.parseInt(date2.substring(0, 4));
        int days = 0;
        int maxYear = Math.max(year1, year2);
        int minYear = Math.min(year1, year2);
        for (int i = minYear; i < maxYear; i++) {
            if (isLeapYear(i)) {
                days += 366;
            } else {
                days += 365;
            }
        }
        int month1 = Integer.parseInt(date1.substring(5, 7));
        int month2 = Integer.parseInt(date2.substring(5, 7));
        int days1 = Integer.parseInt(date1.substring(8));
        int days2 = Integer.parseInt(date2.substring(8));
        int dayOfYear1=getdays(year1,month1,days1,arr);
        int dayOfYear2=getdays(year2,month2,days2,arr);
        if (maxYear == year1) {
            days = days  - dayOfYear2;
            days = days  + dayOfYear1;
        } else {
            days = days  - dayOfYear1;
            days = days  + dayOfYear2;
        }
        return Math.abs(days);
    }

    public int daysBetweenDates(String date1, String date2) {
        int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int DAYS = daysFromDate(date1, date2, monthDays);
        return DAYS;
    }
}