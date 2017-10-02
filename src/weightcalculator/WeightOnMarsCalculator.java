
package weightcalculator;

public class WeightOnMarsCalculator implements WeightCalculator{
    private double weightInPounds;
    
    public void WeightOnMarsCalculator(double weightInPounds){
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
        return (weightInPounds*0.3783);
    }
}
