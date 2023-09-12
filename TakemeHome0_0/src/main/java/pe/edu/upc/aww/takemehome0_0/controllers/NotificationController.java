package pe.edu.upc.aww.takemehome0_0.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.takemehome0_0.dtos.NotificationDTO;
import pe.edu.upc.aww.takemehome0_0.entities.Notification;
import pe.edu.upc.aww.takemehome0_0.serviceinterfaces.INotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private INotificationService nS;

    @PostMapping
    public void registrar(@RequestBody NotificationDTO dto) {

        ModelMapper m = new ModelMapper();
        Notification n = m.map(dto, Notification.class);
        nS.Insert(n);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        nS.delete(id);
    }

    @GetMapping("/{id}")
    public NotificationDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        NotificationDTO dto = m.map(nS.listId(id), NotificationDTO.class);
        return dto;
    }

}
