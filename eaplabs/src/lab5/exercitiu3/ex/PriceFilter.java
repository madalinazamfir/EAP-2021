package lab5.exercitiu3.ex;

import java.util.Arrays;

public class PriceFilter implements FilterProduct<Integer>{
    @Override
    public Product[] filter(Product[] arrayToFilter, Integer value) {
        Product[] filteredProducts = new Product[0];
        for(Product product: arrayToFilter) {
            if(product.getPrice() == value) {
                filteredProducts = Arrays.copyOf(filteredProducts, filteredProducts.length + 1);
                filteredProducts[filteredProducts.length -1] = product;
            }
        }
        return filteredProducts;
    }
}
