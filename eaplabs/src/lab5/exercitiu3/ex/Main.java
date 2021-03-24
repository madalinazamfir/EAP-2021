package lab5.exercitiu3.ex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Sa se realizeze un serviciu care filtreaza produse:
                - sa se filtreze dupa anul fabricatiei
                - sa se filtreze dupa pret
         */

        ProductService service = new ProductService();
        System.out.println(Arrays.toString(service.getOriginal()));
        System.out.println(Arrays.toString(service.filterBy(new YearFilter(), 2015)));
        System.out.println(Arrays.toString(service.filterBy(new PriceFilter(), 25)));

    }
}
