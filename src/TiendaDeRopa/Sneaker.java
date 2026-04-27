package TiendaDeRopa;

import java.util.Map;

public class Sneaker extends Product{
    private boolean isLimitedEdition;
    private String colorWay;
    private Map<String, Integer> sizesStock;

    public Sneaker(String id, String modelName, double basePrice, Map<String, Integer> sizesStock, String colorWay, boolean isLimitedEdition) {
        super(id, modelName, basePrice);
        this.sizesStock = sizesStock;
        this.colorWay = colorWay;
        this.isLimitedEdition = isLimitedEdition;
    }

    public Map<String, Integer> getSizesStock() {
        return sizesStock;
    }

    public void setSizesStock(Map<String, Integer> sizesStock) {
        this.sizesStock = sizesStock;
    }

    public String getColorWay() {
        return colorWay;
    }

    public void setColorWay(String colorWay) {
        this.colorWay = colorWay;
    }

    public boolean isLimitedEdition() {
        return isLimitedEdition;
    }

    public void setLimitedEdition(boolean limitedEdition) {
        isLimitedEdition = limitedEdition;
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "isLimitedEdition=" + isLimitedEdition +
                ", colorWay='" + colorWay + '\'' +
                ", sizesStock=" + sizesStock +
                ", brand=" + brand +
                '}';
    }
}
