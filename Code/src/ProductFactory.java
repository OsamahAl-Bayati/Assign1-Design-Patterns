public class ProductFactory {

    public static Product makeProduct(String name) {
        /* The factory could be used to create any product abstration. For this assignment we are only using one, TestProduct, for demonstration.*/
        return new TestProduct(name);
    }
}