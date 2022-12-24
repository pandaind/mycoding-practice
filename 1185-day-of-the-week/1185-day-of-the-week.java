class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
          String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(year,month-1,day);
        
        return days[cal.get(java.util.Calendar.DAY_OF_WEEK)-1];
    }
}