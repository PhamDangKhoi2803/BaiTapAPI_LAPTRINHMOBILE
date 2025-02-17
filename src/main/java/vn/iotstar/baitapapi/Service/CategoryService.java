package vn.iotstar.baitapapi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.iotstar.baitapapi.entity.Category;
import vn.iotstar.baitapapi.repository.categoryRepository;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private categoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
