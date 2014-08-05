public class Probability  {

    private double probability;

    public  Probability(double value) throws IllegalArgumentException{

        if(value>=0.0 && value<=1.0)
            probability = value;
        else
            throw new IllegalArgumentException("You know probability can have range {0,1}");
    }

    public Probability And(Probability p1)
    {
        return  new Probability(probability*p1.probability);
    }

    public Probability Or(Probability p1)
    {
        double oredProbability = probability + p1.probability - (And(p1).probability);
        return  new Probability(oredProbability);
    }

    public Probability Not()
    {
        return  new Probability(1-probability);
    }




    public boolean Equals(Probability second){
        return probability == second.probability;
    }
}
