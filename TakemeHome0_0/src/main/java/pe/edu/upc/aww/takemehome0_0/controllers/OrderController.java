package pe.edu.upc.aww.takemehome0_0.controllers;


import org.aspectj.weaver.ast.Or;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.takemehome0_0.dtos.OrderDTO;
import pe.edu.upc.aww.takemehome0_0.dtos.UserDTO;
import pe.edu.upc.aww.takemehome0_0.entities.Order;
import pe.edu.upc.aww.takemehome0_0.serviceinterfaces.IOrderService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Orders")
public class OrderController {
    @Autowired
    private IOrderService oR;

    @PostMapping
    public void register(@RequestBody OrderDTO dto){
        ModelMapper m = new ModelMapper();
        Order t = m.map(dto, Order.class);
        oR.insert(t);
    }

    @GetMapping
    public List<OrderDTO> to_list(){
        return oR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, OrderDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        oR.delete(id);
    }

    @GetMapping("/{id}")
    public OrderDTO to_listId(@PathVariable ("id") Integer id) {
        ModelMapper m = new ModelMapper();
        OrderDTO dto = m.map(oR.listId(id), OrderDTO.class);
        return dto;
    }

    @PostMapping("/search :)")
    public List<OrderDTO> search(@RequestParam("address") String destinationAddress){
        return oR.findByDestinationAddress(destinationAddress).stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,OrderDTO.class);
        }).collect(Collectors.toList());
    }

}
