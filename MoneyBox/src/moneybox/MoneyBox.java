package moneybox;

/**
 *
 * @author siror
 */
public class MoneyBox {
    
    private String name;
    private int ones, twos;
    
    public MoneyBox(String name){
        this.name = name;
        ones = 0;
        twos = 0;
    }
    
    public MoneyBox(String name, int pocet1, int pocet2){
        this.name = name;
        this.ones = pocet1;
        this.twos = pocet2;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int suma(){
        return ones + twos*2;
    }
    
    public void addOnes(){
        ones += 1;
    }
    
    public void addTwos(){
        twos += 1;
    }
    
    public void add (int ones, int twos){
        this.ones += ones;
        this.twos += twos;
    }
    
    public String isEnough(int price){
        if(suma() >= price){
            return "koupí";
        }
        return "nekoupí";
    }
    
    @Override
    public String toString(){
        return String.format("%s má v pokladničce %dKč - %dx1Kč, %dx2Kč", getName(), suma(), ones, twos);
    }
}
