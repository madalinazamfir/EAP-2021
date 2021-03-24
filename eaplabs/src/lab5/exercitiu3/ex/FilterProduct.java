package lab5.exercitiu3.ex;

public interface FilterProduct<T> {

    Product[] filter(Product[] arrayToFilter, T value);
}
