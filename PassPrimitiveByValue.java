import shape.*;

public class PassPrimitiveByValue {
    public void moveCircle(Circle circle,int dX,int dY){
        circle.setX(circle.getX()+dX);
        circle.setY(circle.getY() + dY);

        circle = new Circle(0,0);

    }

    public static void main(String[] args){
            Circle myCircle = new Circle(5,10);
            PassPrimitiveByValue obj = new PassPrimitiveByValue();
            
            obj.moveCircle(myCircle, 23, 56);

            System.out.println("x : "+ myCircle.getX() + ", Y : "+ myCircle.getY());
    }
}

 