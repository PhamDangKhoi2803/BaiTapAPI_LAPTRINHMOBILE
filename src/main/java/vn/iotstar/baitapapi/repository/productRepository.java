package vn.iotstar.baitapapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.iotstar.baitapapi.entity.Product;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface productRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);
}
