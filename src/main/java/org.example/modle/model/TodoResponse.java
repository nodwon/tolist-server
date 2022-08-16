package org.example.modle.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TodoResponse {
    private Long id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    public TodoResponse(TodoEntity todoEntity){
        this.id = todoEntity.getId();
        this.title = todoEntity.getTitle();
        this.order = todoEntity.getOrder();
        this.completed =todoEntity.getCompleted();

        this.url = "http://localhost:8080/" + this.id; // 안좋은 코드  강제로 설정하기 때문에 할때마다 코드 변경 해야하기 때문에
    }
}
