package TiendaDeRopa;



abstract class Product {
    private String id;
    private String modelName;
    private double basePrice;
    Brand brand;
    public Product(String id, String modelName, double basePrice) {
        this.id = id;
        this.modelName = modelName;
        this.basePrice = basePrice;

    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", modelName='" + modelName + '\'' +
                ", basePrice=" + basePrice +
                ", brand=" + brand +
                '}';
    }
}
