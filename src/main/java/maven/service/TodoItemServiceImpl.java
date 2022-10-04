package maven.service;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import maven.model.TodoData;
import maven.model.TodoItem;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TodoItemServiceImpl implements TodoItemService{
    // == fields ==
    private final @Getter TodoData data = new TodoData();


    @Override
    public void addItem(TodoItem toAdd) {
        data.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdate) {
        data.updateItem(toUpdate);
    }

}
