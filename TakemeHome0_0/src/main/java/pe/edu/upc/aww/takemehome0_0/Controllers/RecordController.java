package pe.edu.upc.aww.takemehome0_0.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.takemehome0_0.DTOs.RecordDTO;
import pe.edu.upc.aww.takemehome0_0.ServiceInterfaces.IRecordService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("records")
public class RecordController {
    @Autowired
    private IRecordService rS;
    @PostMapping
    public void register(@RequestBody RecordDTO dto) {
        ModelMapper m = new ModelMapper();
        Record r = m.map(dto, Record.class);
        rS.insert(r);
    }
    @GetMapping
    public List<RecordDTO> to_list() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RecordDTO.class);
        }).collect(Collectors.toList());
    }

}
