package pe.edu.upc.aww.takemehome0_0.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehome0_0.Entities.Role;
import pe.edu.upc.aww.takemehome0_0.Repositories.IRoleRepository;
import pe.edu.upc.aww.takemehome0_0.ServiceInterfaces.IRolesService;

import java.util.List;

@Service
public class RoleServiceImplement implements IRolesService {

    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

}
