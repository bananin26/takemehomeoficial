package pe.edu.upc.aww.takemehome0_0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Orders")
public class OrderController {
    @Autowired
    private IOrderService oR;
    @GetMapping("/SumatoryPurchasesByUser")
    public List<TotalPurchasesByUserDTO> SumatoriaComprasPorUsuario() {
        List<String[]> lista=oR.totalPurchasesByPerson();
        List<TotalPurchasesByUserDTO> listaDTO= new ArrayList<>();
        for(String[] data:lista){
            TotalPurchasesByUserDTO dto= new TotalPurchasesByUserDTO();
            dto.setName(data[0]);
            dto.setTotalPurchases(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
