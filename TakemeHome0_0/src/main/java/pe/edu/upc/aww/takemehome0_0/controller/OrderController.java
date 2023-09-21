package pe.edu.upc.aww.takemehome0_0.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class OrderController {
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
