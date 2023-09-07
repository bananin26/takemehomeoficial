package pe.edu.upc.aww.takemehome0_0.entities;

import javax.persistence.*;

@Entity
@Table(name = "roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "rol" }) })
public class Roles implements Serializable {



}
