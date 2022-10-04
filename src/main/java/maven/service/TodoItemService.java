package maven.service;

import maven.model.TodoData;
import maven.model.TodoItem;

public interface TodoItemService {

    public void addItem(TodoItem toAdd);

    public void removeItem(int id);

    public TodoItem getItem(int id);

    public void updateItem(TodoItem toUpdate);

    public TodoData getData();

}
