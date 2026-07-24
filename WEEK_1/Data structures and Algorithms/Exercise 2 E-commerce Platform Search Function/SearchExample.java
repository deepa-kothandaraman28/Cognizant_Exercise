import java.util.Arrays;
import java.util.Comparator;
public class SearchExample {

    static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == targetId)
                return products[mid];
            else if (products[mid].productId < targetId)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Phone", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(102, "Watch", "Accessories")
        };

        Product result1 = linearSearch(products, 102);

        if (result1 != null)
            result1.display();
        else
            System.out.println("Product not found");

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        Product result2 = binarySearch(products, 102);

        if (result2 != null)
            result2.display();
        else
            System.out.println("Product not found");
    }
}