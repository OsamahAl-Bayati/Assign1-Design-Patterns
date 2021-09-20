import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try {
            File database = new File ("database.txt");
            Scanner reader = new Scanner(database);

            while (reader.hasNextLine()) {
                String[] data = reader.nextLine().split(":");

                String name = data[0];
                double price = Double.parseDouble(data[1]);

                AbstractFactory product = ProductFactory.makeProduct(name);
                product.setPrice(price);

                System.out.println(product.toString());
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to establish a database connection.");
            e.printStackTrace();
        }
    }
}