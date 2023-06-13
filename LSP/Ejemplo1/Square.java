package LSP.Ejemplo1;

class Square extends Shape {
    private int sideLength;
    
    public Square(int sideLength) {
        this.sideLength = sideLength;
    }
    
    public int getSide() {
        return this.sideLength;
    }
    
    public void setSide(int sideLength) {
        this.sideLength = sideLength;
    }
    
    @Override
    public int getArea(){
        return sideLength * sideLength;
    }
}