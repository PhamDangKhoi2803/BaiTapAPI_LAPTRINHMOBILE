package vn.iotstar.baitapapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.iotstar.baitapapi.entity.Category;

@Repository
public interface categoryRepository extends JpaRepository<Category, Long> {
}
