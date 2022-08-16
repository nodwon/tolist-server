package org.example.control;

import lombok.AllArgsConstructor;
import org.example.modle.model.TodoEntity;
import org.example.modle.model.TodoRequest;
import org.example.modle.model.TodoResponse;
import org.example.serivce.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class TodoController {
    private final TodoService service;

    @PostMapping
    public ResponseEntity<TodoResponse> create(@RequestBody TodoRequest request){
        System.out.println("CREATE");
        if(ObjectUtils.isEmpty(request.getTitle()))
            return ResponseEntity.badRequest().build();

        if(ObjectUtils.isEmpty(request.getOrder()))
            request.setOrder(0L);

        if(ObjectUtils.isEmpty(request.getCompleted()))
            request.setCompleted(false);
        TodoEntity result = this.service.add(request);
        return ResponseEntity.ok(new TodoResponse(result));
        return null;
    }
    @GetMapping
    public ResponseEntity<TodoResponse> readOne(){
        System.out.println("READ ONE");
        return null;
    }
    @GetMapping
    public ResponseEntity<List<TodoResponse>> readAll(){
        System.out.println("READ ALL");
        return null;
    }
    @PatchMapping
    public ResponseEntity<TodoResponse> update(){
        System.out.println("UPDATE");
        return null;
    }
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteOne(){
        System.out.println("DELETE");
        return null;
    }
    @DeleteMapping
    public ResponseEntity<?> deleteAll(){
        System.out.println("DELETE ALL");
        return null;
    }
}
