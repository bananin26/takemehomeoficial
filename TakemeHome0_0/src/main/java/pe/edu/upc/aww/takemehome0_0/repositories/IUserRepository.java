package pe.edu.upc.aww.takemehome0_0.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.aww.takemehome0_0.entities.User;

import java.time.LocalDate;
import java.util.List;

public interface IUserRepository extends JpaRepository<User,Integer> {
    List<User> findByBirthday(LocalDate birthday);

    @Query("SELECT COUNT(t) FROM User t")
    Long countUsers();

}
