package pe.edu.upc.aww.takemehome0_0.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehome0_0.entities.Product;
import pe.edu.upc.aww.takemehome0_0.repositories.IProductRepository;
import pe.edu.upc.aww.takemehome0_0.serviceinterfaces.IProductService;

import java.util.List;

@Service
public class ProductServiceImplement implements IProductService {
    @Autowired
    private IProductRepository pR;
    @Override
    public void insert(Product product) {
        pR.save(product);
    }

    @Override
    public List<Product> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idProduct) {
        pR.deleteById(idProduct);
    }

    @Override
    public Product listId(int idOrder) {
        return null;
    }

    @Override
    public List<Product> findByNameProduct(String nameProduct) {
        return pR.findByNameProduct( nameProduct);
    }

    @Override
    public List<String[]> counterProductsForUsers() {
        return pR.countProductsWithUsers();
    }

    @Override
    public List<String[]> showDescriptionPerOrder() {
        return null;
    }

    public List<String []>listPricesGreaterThan1000(){return pR.listPricesGreaterThan1000();}

}
