package lab5.exercitiu3.ex;

import java.util.Random;

public class ProductService {

    private Product[] products = new Product[10];

    public ProductService() {
        this.initProducts();
    }

    public Product[] getOriginal() {
        return products;
    }

    public Product[] filterBy(FilterProduct filter, Object value) {
        return filter.filter(products, value);
    }


    private void initProducts() {
        int[] years = {2015, 2010};
        int[] prices = {10, 15, 20, 25};
        Random random = new Random();
        for(int i = 0; i < products.length; i++) {
            Product product = new Product(years[random.nextInt(2)], prices[random.nextInt(4)]);
            products[i] = product;
        }
    }
}
