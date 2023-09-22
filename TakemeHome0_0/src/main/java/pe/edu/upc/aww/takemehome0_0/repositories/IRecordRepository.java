package pe.edu.upc.aww.takemehome0_0.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.takemehome0_0.entities.Record;

import java.util.List;

@Repository
public interface IRecordRepository extends JpaRepository<Record,Integer> {

    @Query("SELECT idRecord, SUM(points) " +
            "FROM Record \n" +
            "GROUP BY idRecord") public List<String[]> countPointsProduct();
}
