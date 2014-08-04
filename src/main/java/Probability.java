public class Probability {

    private double probability;

    public  Probability(double value) throws Exception{

        if(value>=0.0 && value<=1.0)
            probability = value;
        else
            throw new Exception("You know probability can have range {0,1}");
    }

    public double And(Probability p1)
    {
        return  probability*p1.probability;
    }

    public double Or(Probability p1)
    {
        double secondProbability=p1.probability;
        return  (probability+secondProbability) - this.And(p1);
    }

    public double Not()
    {
        return  1-probability;
    }

    public boolean Equals(Probability second){
        return probability == second.probability;
    }
}
