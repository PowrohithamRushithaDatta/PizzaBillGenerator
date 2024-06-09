import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Pizza basepizza = new Pizza(false);
//        basepizza.addExtraCheese();
//        basepizza.addExtraTopping();
//        basepizza.getBill();
        DeluxPizza dp = new DeluxPizza(false);
        dp.takeAway();
        dp.getBill();
    }
}