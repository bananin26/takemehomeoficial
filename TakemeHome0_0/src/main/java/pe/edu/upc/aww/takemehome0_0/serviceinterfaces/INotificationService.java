package pe.edu.upc.aww.takemehome0_0.serviceinterfaces;

import pe.edu.upc.aww.takemehome0_0.entities.Notification;

public interface INotificationService {
    public void insert(Notification notification);
    public void delete(int idNotification);
    public Notification listId(int idNotification);
}
