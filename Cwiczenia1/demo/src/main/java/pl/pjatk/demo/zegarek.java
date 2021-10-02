package pl.pjatk.demo;

public class zegarek {
    private String model;
    private double value;

    public zegarek(String model, double value) {
        this.model = model;
        this.value = value;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
