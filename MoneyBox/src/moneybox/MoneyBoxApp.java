package moneybox;

/**
 *
 * @author siror
 */
public class MoneyBoxApp {

    public static void main(String[] args) {
        MoneyBox Alice = new MoneyBox("Alice", 9, 15);
        MoneyBox Bob = new MoneyBox("Bob");
        Bob.addOnes();
        Bob.addOnes();
        Bob.addTwos();
        Bob.addTwos();
        Bob.addTwos();
        Bob.add(5, 10);
        System.out.format("Bob má %dKč, Alice má %dKč.\n", Bob.suma(), Alice.suma());
        System.out.println(Bob);
        System.out.println(Alice);
        System.out.format("Bob si hamburger %s, Alice si hamburger %s.\n", Bob.isEnough(39), Alice.isEnough(39));
        System.out.format("Víc peněz má %s.\n", (Bob.suma()>Alice.suma())?"Bob":"Alice");
    }
    
}
