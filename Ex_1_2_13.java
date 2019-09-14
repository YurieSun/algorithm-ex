import java.sql.Date;
import java.util.Objects;
import java.util.Date;

/**
 * Impelement Transaction class, and override equals(), toString(), compareTo(). 
 * Tip: need to change class name or file name when running.
 */

public class Transaction implements Comparable<Transaction>{
    private String who;
    private Date when;
    private double amount;
    Transaction(String who, Date when, double amount){
        this.who = who;
        this.when = when;
        this.amount = amount;
    }
    Transaction(String transaction){
        String[] fields = transaction.split("//s+");
        this.who = fields[0];
        this.when = new Date(fields[1]);
        this.amount = Double.parseDouble(fields[2]);
    }
    public String who(){
        return who;
    }
    public Date when(){
        return when;
    }
    public double amount(){
        return amount;
    }
    public String toString(){
        return "Person: " + who + ", Date: " + when + ", amount: " + amount;
    }
    public boolean equals(Object that){
        if(this == that) return true;
        if(that == null) return false;
        if(this.getClass() != that.getClass()) return false;
        Transaction x = (Transaction) that;
        //比较对象是否相同注意用equals()方法
        return this.who.equals(x.who) && this.when.equals(x.when) && this.amount == x.amount;
    }
    public int compareTo(Transaction that){
        if (this.amount > that.amount) return 1;
        else if (this.amount < that.amount) return -1;
        else return 0;
    }
    public int hashCode()
    {
        return Objects.hash(who, when, amount);
    }

    public static void main(String[] args) {
        //test
    }
}