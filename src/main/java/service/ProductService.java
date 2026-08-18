package service;

import model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>(
            List.of(
                    new Product("P001", "Laptop MSI", 22_000_000),
                    new Product("P002", "LG Monitor", 4_000_000),
                    new Product("P003", "Logitech Keyboard", 1_500_000)
            )
    );

    public List<Product> getAllProducts() {
        return products;
    }
}
