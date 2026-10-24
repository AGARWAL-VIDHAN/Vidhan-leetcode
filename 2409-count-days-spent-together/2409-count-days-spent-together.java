class Solution {
    private int daysFromDate(String date,int[] arr){
        int Month=Integer.parseInt(date.substring(0,2));
        int days=Integer.parseInt(date.substring(3));
        return arr[Month-1]+days;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] monthDays={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] arr=new int[13];
        arr[1]=31;
        for(int i=2;i<13;i++){
            arr[i]=arr[i-1]+monthDays[i-1];
        }
        int  arriveAliceDays=daysFromDate(arriveAlice,arr);
        int leaveAliceDays=daysFromDate(leaveAlice,arr);
        int arriveBobDays=daysFromDate(arriveBob,arr);
        int leaveBobDays=daysFromDate(leaveBob,arr);
        int overlapDays=Math.min(leaveAliceDays,leaveBobDays) - Math.max(arriveAliceDays,arriveBobDays)+1;
        if(overlapDays<0){
            return 0;
        }
        return overlapDays;
        
    }
}