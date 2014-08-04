
public class Rectangle implements  IAreaAble{
    private Double Length;
    private Double Breadth;

    public Rectangle(Double length, Double breadth){
        Length = length;
        Breadth = breadth;
    }

    public Double Area(){
        return Length*Breadth;
    }
}

