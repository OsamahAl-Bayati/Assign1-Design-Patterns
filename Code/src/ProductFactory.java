public class ProductFactory {

    public enum ProductType { CAR, ELECTRONIC, FURNITURE }

    public static Product makeProduct(ProductType type, String name) {
        Product product = null;

        switch (type) {
            case CAR:
                product = new CarProduct(name);
                break;
            case ELECTRONIC:
                product = new ElectronicProduct(name);
                break;
            case FURNITURE:
                product = new FurnitureProduct(name);
                break;

            default:
                break;

        }

        return product;
    }
}