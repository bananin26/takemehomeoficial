package pe.edu.upc.aww.takemehome0_0.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.aww.takemehome0_0.entities.Product;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Integer> {
    List<Product>findByNameProduct(String nameProduct);

    @Query("select u.name, sum(p.idProduct)\n" +
            "from User u inner join Product p\n" +
            "on u.idUser=p.idProduct \n" +
            "group by u.name")
    public List<String[]> countProductsWithUsers();
}
