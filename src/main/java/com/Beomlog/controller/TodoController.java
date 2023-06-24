package com.Beomlog.controller;


import com.Beomlog.entity.Todo;
import com.Beomlog.service.TodoService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;


    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id);
    }

    @PutMapping("/{id}")
    public Todo updateTodoById(@PathVariable Long id, @RequestBody Todo todoDetails) {
        return todoService.updateTodoById(id, todoDetails);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTodoById(@PathVariable Long id) {
        return todoService.deleteTodoById(id);
    }
}