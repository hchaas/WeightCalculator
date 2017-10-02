
package weightcalculator;

public class Startup {

    public static void main(String[] args) {
        WeightCalculator myMoonWeight = new WeightOnMoonCalculator();
        WeightCalculatorService myWeight = new WeightCalculatorService(myMoonWeight);
        System.out.println("Your weight on the moon is: " + myWeight.calculateWeightService(150) + " pounds.");
    }
    
}
