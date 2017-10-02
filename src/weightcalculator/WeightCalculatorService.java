
package weightcalculator;

public class WeightCalculatorService {
    private WeightCalculator weightCalculator;
    
    public WeightCalculatorService (WeightCalculator weightCalculator){
        this.weightCalculator = weightCalculator;
    }
    
    public final double calculateWeightService(double weight){
        return this.weightCalculator.calculateWeight(weight);
    }
}
