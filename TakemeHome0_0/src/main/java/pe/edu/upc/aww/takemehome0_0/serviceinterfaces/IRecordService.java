package pe.edu.upc.aww.takemehome0_0.serviceinterfaces;

import pe.edu.upc.aww.takemehome0_0.entities.Order;
import pe.edu.upc.aww.takemehome0_0.entities.User;
import pe.edu.upc.aww.takemehome0_0.repositories.IRecordRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;


public interface IRecordService {
    public void insert(Record record);
    public List<Record> list();
}
