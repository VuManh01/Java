package ordermanager.controller;

import ordermanager.entity.Entity;
import ordermanager.model.Model;

import java.sql.SQLException;
import java.util.List;

public class Controller<T extends Entity<?>> {
    private Model<T> model;

    public Controller(Model<T> model) {
        this.model = model;
    }
    public void addEntity(T entity) throws SQLException {
        model.addEntity(entity);
    }
    public List<T> getAllEntity() throws SQLException {
        return model.getAllEntity();
    }
    public List<T> getAll(){
        return model.getALlEntity1();
    }

    public void updateEntity(T entity){
        model.updateEntity(entity);
    }
    public void deleteEntity(T entity){
        model.deleteEntity(entity);
    }
    public T getEntityById(int entityId){
        return model.getEntityById(entityId);
    }
}
