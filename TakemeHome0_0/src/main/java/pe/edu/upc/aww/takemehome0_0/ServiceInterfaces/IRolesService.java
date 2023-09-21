package pe.edu.upc.aww.takemehome0_0.ServiceInterfaces;

import pe.edu.upc.aww.takemehome0_0.Entities.Role;

import java.util.List;

public interface IRolesService {

    public void insert(Role role);
    public List<Role> list();
}
