package pe.edu.upc.aww.takemehome0_0.ServiceInterfaces;

import java.util.List;

public interface IRecordService {
    public void insert(Record record);
    public List<Record> list();
    public List<String[]>countPointsProduct();
}
