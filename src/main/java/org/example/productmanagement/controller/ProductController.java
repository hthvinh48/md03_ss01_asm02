package org.example.productmanagement.controller;

import org.example.productmanagement.model.Product;
import org.springframework.web.bind.annotation.*;
import org.example.productmanagement.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public String addProduct(@RequestBody Product product) {
        return productService.addProduct(product) ? "Added product successfully" : "Failed to add product successfully";
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable String id, @RequestBody Product product) {
        return productService.updateProduct(product, id) ?  "Updated product successfully" : "Failed to update product";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable String id) {
        return productService.deleteProduct(id) ?  "Deleted product successfully" : "Failed to delete product";
    }
}