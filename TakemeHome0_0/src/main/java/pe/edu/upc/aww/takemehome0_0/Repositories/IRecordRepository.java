package pe.edu.upc.aww.takemehome0_0.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRecordRepository extends JpaRepository<Record,Integer> {

    @Query("select o.idOrder, p.points\n" +
            "from Order o inner join Record p\n" +
            "on o.idOrder=p.idRecord\n" +
            "ORDER BY p.idRecord")
    public List<String[]> countPointsProduct();
}
