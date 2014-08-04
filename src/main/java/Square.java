public class Square implements IAreaAble{

    private Double Side;

    public Square(Double side){
        Side = side;
    }

    public Double Area(){
        return Side*Side;
    }
}