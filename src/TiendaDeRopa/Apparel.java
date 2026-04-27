package TiendaDeRopa;

public class Apparel extends Product{
    materialTipo material;

    public Apparel(String id, String modelName, double basePrice, materialTipo material) {
        super(id, modelName, basePrice);
        this.material = material;
    }

    public materialTipo getMaterial() {
        return material;
    }

    public void setMaterial(materialTipo material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Apparel{" +
                "material=" + material +
                ", brand=" + brand +
                '}';
    }
}
