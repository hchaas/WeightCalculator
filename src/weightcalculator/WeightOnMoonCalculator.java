
package weightcalculator;

public class WeightOnMoonCalculator implements WeightCalculator{
    private double weightInPounds;
    
    public void WeightOnMoonCalculator(double weightInPounds){
        this.setWeightInPounds(weightInPounds);
    }
    
    public final void setWeightInPounds(double weightInPounds){
        if (weightInPounds == 0 || weightInPounds < 0){
            throw new IllegalArgumentException("Weight cannot be less than or equal to zero.");
        }
        else{
            this.weightInPounds = weightInPounds;
        }
    }
    
    @Override
    public double calculateWeight(double weightInPounds){
        return weightInPounds/6;
    }
}
