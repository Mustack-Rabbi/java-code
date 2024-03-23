package java_assignment.inheritance;
/**
 * Father
 */
class Father {
    int money_cash = 50000;
    int money_bank = 200000;
}

/**
 * Son
 */
class Son extends Father {
    int total;
    public  void totalproparty() {
        total = money_cash + money_bank;
        System.out.println("Total Money :" + total);  
    }
    
}
public class single_inheritance {
    public static void main(String[] args) {
        System.out.println("Assignment: Inheritence (Singel Inheritence)");
        System.out.println("============================================");
        System.out.println("Father >> Sone");
        System.out.println("--------------------------------------------");

        Father obj1 = new Father();
        Son obj2 = new Son();

        System.out.println("Father Cash amount: " + obj1.money_cash);
        System.out.println("Father Bank amount: " + obj1.money_bank);
        obj2.totalproparty();
    }
}
/* TERMINAL:


Assignment: Inheritence (Singel Inheritence)
============================================
Father >> Sone
--------------------------------------------
Father Cash amount: 50000
Father Bank amount: 200000
Total Money :250000
 */