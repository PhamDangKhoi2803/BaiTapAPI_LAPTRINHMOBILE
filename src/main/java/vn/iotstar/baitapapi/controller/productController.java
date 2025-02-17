package vn.iotstar.baitapapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.iotstar.baitapapi.Service.ProductService;
import vn.iotstar.baitapapi.entity.Product;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class productController {
    @Autowired
    private ProductService productService;

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable Long categoryId) {
        return ResponseEntity.ok(productService.getProductsByCategory(categoryId));
    }

    @GetMapping("/top-selling")
    public ResponseEntity<List<Product>> getTop10BestSellingProducts() {
        return ResponseEntity.ok(productService.getTop10BestSellingProducts());
    }
}
