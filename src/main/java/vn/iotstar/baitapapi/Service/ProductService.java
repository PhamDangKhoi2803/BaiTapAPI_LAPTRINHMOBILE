package vn.iotstar.baitapapi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.iotstar.baitapapi.entity.Product;
import vn.iotstar.baitapapi.repository.productRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private productRepository productRepository;

    public List<Product> getProductsByCategory(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    public List<Product> getTop10BestSellingProducts() {
        return productRepository.findTop10ByOrderByQuantitySoldDesc();
    }

    public List<Product> getTop10NewestProducts() {
        LocalDateTime sevenDaysAgo = LocalDateTime.now().minusDays(7);
        return productRepository.findTop10ByCreatedAtAfterOrderByCreatedAtDesc(sevenDaysAgo);
    }
}
