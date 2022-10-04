package maven.controller;

import maven.model.TodoData;
import maven.model.TodoItem;
import maven.service.TodoItemService;
import maven.util.AttributeNames;
import maven.util.Mappings;
import maven.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoItemController {

    // == fields ==
    private final TodoItemService todoItemService;

    @Autowired
    public TodoItemController(TodoItemService todoItemService){
        this.todoItemService = todoItemService;
    }

    // == model attributes ==
    @ModelAttribute
    public TodoData todoData(){
        return todoItemService.getData();
    }

    // == handler methods ==
    //http://localhost:8080/Todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }

    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM) TodoItem todoItem) {
        todoItemService.addItem(todoItem);
        return "redirect:/"+ Mappings.ITEMS;
    }
}
