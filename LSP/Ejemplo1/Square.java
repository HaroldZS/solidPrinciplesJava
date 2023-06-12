package LSP.Ejemplo1;

class Square extends Rectangle {
    public Square(int sideLength) {
        super(sideLength, sideLength);
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}