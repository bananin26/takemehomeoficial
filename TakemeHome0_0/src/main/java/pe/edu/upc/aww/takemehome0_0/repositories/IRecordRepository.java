package pe.edu.upc.aww.takemehome0_0.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.takemehome0_0.entities.Record;

@Repository
public interface IRecordRepository extends JpaRepository<Record,Integer> {
}
