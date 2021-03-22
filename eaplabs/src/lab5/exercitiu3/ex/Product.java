package lab5.exercitiu3.ex;

public class Product {

    private int manufacturingYear;
    private int price;

    public Product(int manufacturingYear, int price) {
        this.manufacturingYear = manufacturingYear;
        this.price = price;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacturingYear=" + manufacturingYear +
                ", price=" + price +
                '}';
    }
}
