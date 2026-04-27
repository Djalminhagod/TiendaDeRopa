package TiendaDeRopa;

import java.util.List;

public class InventoryManager {
     List<Product> products;
     public void addProduct(Product p){
         products.add(p);
     }
    public void showProducts(){
        for(Product p:products){
            System.out.println(p);
        }
    }
    public void findProductByName(String brandName){
        for(Product p:products){
            if(p.getBrand().equals(brandName)){
                System.out.println(p);
            }
        }
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "InventoryManager{" +
                "products=" + products +
                '}';
    }
}
