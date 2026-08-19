package org.example.productmanagement.service;

import org.example.productmanagement.model.Product;
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

    public boolean addProduct(Product product) {
        return products.add(product);
    }

    public boolean updateProduct(Product product, String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                products.remove(p);
                return true;
            }
        }
        return false;
    }
}
