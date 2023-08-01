import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i=0; i < (numWeeks+1); i++ ){
            sum += i;
        }
        return sum;
    }


    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i< menuItems.size(); i++){
            System.out.println(menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name.");
        String username = System.console().readLine();
        System.out.printf("Hello, %s!\n", username);
        System.out.printf("There are %d people in front of you. \n ", customers.size());
        customers.add(username);
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        for( int i = 1; i <= maxQuantity; i++) {
        double purchaseAmount = (price * i) - (.50 * i);
        System.out.printf("%s\n %d - $%.2f\n",product, i, purchaseAmount);
        }
    }


public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
      if(menuItems.size() != prices.size()){
        return false;
      } else {
        for( int i =0; i < menuItems.size(); i++){
            System.out.printf("%d %s -- $%.2f\n", i, menuItems.get(i), prices.get(i));
        }
      }
    return true;
    }

}