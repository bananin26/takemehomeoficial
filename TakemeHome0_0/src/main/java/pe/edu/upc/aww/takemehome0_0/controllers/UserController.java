package pe.edu.upc.aww.takemehome0_0.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.takemehome0_0.dtos.MessageByPersonDTO;
import pe.edu.upc.aww.takemehome0_0.dtos.UserDTO;
import pe.edu.upc.aww.takemehome0_0.entities.User;
import pe.edu.upc.aww.takemehome0_0.serviceinterfaces.IUserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Users")
public class UserController {
    @Autowired
    private IUserService uS;

    @PostMapping
    public void register(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        User u= m.map(dto, User.class);
        uS.insert(u);
    }

    @GetMapping
    public List<UserDTO> to_list(){
        return uS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,UserDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        uS.delete(id);
    }
    @GetMapping("/{id}")
    public UserDTO to_listId(@PathVariable ("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listId(id),UserDTO.class);
        return dto;
    }

    @PostMapping("/search :)")
    public List<UserDTO> search(@RequestParam("date") LocalDate date){
        return uS.findByBirthday(date).stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,UserDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void change(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        User p = m.map(dto,User.class);
        uS.insert(p);
    }

    @GetMapping("/counter")
    public Long counter() {
        return uS.counterUsers();
    }

    @GetMapping("/cantidadmensajesporpersona")
    public List<MessageByPersonDTO> cantidadMensajesPorPersona() {
        List<String[]> lista=uS.quantityMessageByPerson();
        List<MessageByPersonDTO> listaDTO= new ArrayList<>();
        for(String[] data:lista){
            MessageByPersonDTO dto= new MessageByPersonDTO();
            dto.setName(data[0]);
            dto.setQuantityMessage(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }


}
