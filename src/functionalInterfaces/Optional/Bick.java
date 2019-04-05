package functionalInterfaces.Optional;

public class Bick {

    private String name;
    private String model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bick{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
