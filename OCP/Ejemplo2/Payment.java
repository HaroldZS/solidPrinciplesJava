package OCP.Ejemplo2;

public class Payment {
    private String type;
    
    public Payment(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}