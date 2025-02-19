public class Car {

    private String make = "Tesla";
    private String model = "Samsung";
    private String color = "Red";
    private int doors = 3;
    private boolean open = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isOpen() {
        return open;
    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "holden", "porche", "tesla" -> this.make = make;
            default -> {
                    this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public  void describeCar() {
        System.out.println("Make : " + make
        + "\nModel : " + model
        + "\nColor : " + color
        + "\nDoors : " + doors
        + "\nOpen : " + open);
    }
}
