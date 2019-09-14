import java.sql.Date;
import java.util.Objects;

/**
 * Impelement SmartDate class, and override equals(), toString(), compareTo(). 
 * Tip: need to change class name or file name when running.
 */

public class SmartDate implements Comparable<SmartDate>{
    private int month;
    private int day;
    private int year;
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
        if (!isLegal()) throw new RuntimeException();
    }
    public Date(String date){
        String[] fields = date.split("/");
        this.month = Integer.parseInt(fields[0]);
        this.day = Integer.parseInt(fields[1]);
        this.year = Integer.parseInt(fields[2]);
        if (!isLegal()) throw new RuntimeException();
    }
    public int month(){
        return month;
    }
    public int day(){
        return day;
    }
    public int year(){
        return year;
    }
    public String toString(){
        return month() + "/" + day() + "/" + year();
    }
    public boolean equals(Object that){
        if (this == that) return true;
        if (that == null) return false;
        if (this.getClass() != that.getClass()) return false;
        SmartDate x = (SmartDate) that;
        return this.month == x.month && this.day == x.day && this.year == x.year;
    }
    public int compareTo(Date that){
        if (this.year > that.year) return 1;
        if (this.year < that.year) return -1;
        if (this.month > that.month) return 1;
        if (this.month < that.month) return -1;
        if (this.day > that.day) return 1;
        if (this.day < that.day) return -1;
        return 0;
    }
    public int hashCode(){
        return Objects.hash(month, day, year);
    }
    public boolean isLegal(){
        if(month < 0 || month > 12 || year < 0 || day < 0) return false;
        boolean isRun = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            isRun = true;
        int[] run = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
        int[] ping = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
        if (isRun && day > run[month - 1]) return false;
        if (!isRun && day > ping[month - 1]) return false;
        return true;
    }
    public String dayOfWeek(){
        //除使用java类库，还有别的方法吗？
    }
    public static void main(String[] args) {
        //test
    }
}