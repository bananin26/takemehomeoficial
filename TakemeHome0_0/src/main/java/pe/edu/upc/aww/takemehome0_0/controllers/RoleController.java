package pe.edu.upc.aww.takemehome0_0.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.takemehome0_0.dtos.RoleDTO;
import pe.edu.upc.aww.takemehome0_0.dtos.UserDTO;
import pe.edu.upc.aww.takemehome0_0.entities.Role;
import pe.edu.upc.aww.takemehome0_0.entities.User;
import pe.edu.upc.aww.takemehome0_0.serviceInterfaces.IRolesService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/Role")
public class RoleController {
    @Autowired
    private IRolesService rS;

    @PostMapping
    public void register(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Role r= m.map(dto, Role.class);
        rS.insert(r);
    }

    @GetMapping
    public List<RoleDTO> to_list(){
        return rS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,RoleDTO.class);
        }).collect(Collectors.toList());
    }

}
