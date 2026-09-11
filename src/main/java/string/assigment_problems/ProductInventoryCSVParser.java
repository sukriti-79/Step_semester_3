package string.assigment_problems;

public class ProductInventoryCSVParser {

    public static void parseCSV(String csv) {

        String[] products = csv.split(",");

        System.out.println("Number of products: " + products.length);

        for (String product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {

        String csv = "Laptop,Mouse,Keyboard,Monitor";

        parseCSV(csv);
    }
}