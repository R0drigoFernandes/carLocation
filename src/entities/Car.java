package entities;

public class Car {
    private String model;

    public Car(){
        super();
    }
    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
