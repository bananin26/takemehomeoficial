package pe.edu.upc.aww.takemehome0_0.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aww.takemehome0_0.Entities.Category;

import java.util.List;
public interface ICategoryRepository extends JpaRepository<Category,Integer> {
    List<Category> findByNameCategory(String nameCategory);


}
