package java_assignment.inheritance;

/**
 * Father3
 * * super Class
 */
class Father3 {
    int money_proparty = 10;
    int money_cash = 50;
    int money_bank = 20;

    public void totalproparty() {
        int total;
        total = money_cash + money_bank + money_proparty;
        System.out.println("Total Balance:" + total);
    }
}

/**
 * Son3
 */
class Son3 extends Father3 {

    void son3_balance() {
        double son3_total;
        son3_total = (money_cash * 0.5) + money_bank + (money_proparty * 0.5);

        System.out.println("Son3 Total Balance: " + son3_total);
    }

}

/**
 * Mother 3
 */
class Mother3 extends Father3 {
  
    void mother3_balance() {
        double mother3_total;
        mother3_total = (money_cash * 0.5) + (money_proparty * 0.5);

        System.out.println("Mother 3 Total Balance: " + mother3_total);
    }

}

public class hirerarchical_inheritance {
    public static void main(String[] args) {
        System.out.println("Assignment: Inheritence (hirerarchical Inheritence)");
        System.out.println("============================================");
        System.out.println("Father 3 >> Sone balance");
        System.out.println("--------------------------------------------");

        Father3 obj1 = new Father3();
        Son3 obj2 = new Son3();
        Mother3 obj3 = new Mother3();

        System.out.println("Father Prpperty amount: " + obj1.money_proparty);
        System.out.println("Father Cash amount: " + obj1.money_cash);
        System.out.println("Father Bank amount: " + obj1.money_bank);

        obj2.totalproparty();
        obj2.son3_balance();
        obj3.mother3_balance();
    }
}
