package pe.edu.upc.aww.takemehome0_0.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aww.takemehome0_0.entities.Product;

import java.util.List;

public interface IProductRespository extends JpaRepository<Product,Integer> {
    List<Product>findByNameProduct(String nameProduct);
}
