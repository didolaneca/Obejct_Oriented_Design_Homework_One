/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/
public class Square extends Shape {
    private final double sideLength;
    public Square(double sideLength, String name){
        super(name);
        this.sideLength = sideLength;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.sideLength;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Square)){
            return false;
        }
        Square other = (Square) obj;

        return this.sideLength == other.sideLength && name.equals(other.getName());
    }

    @Override
    public String toString() {
        return new StringBuilder(this.name)
                .append(":")
                .append(this.sideLength)
                .toString();
    }

    public double getArea(){
        return this.sideLength * this.sideLength;
    }

}