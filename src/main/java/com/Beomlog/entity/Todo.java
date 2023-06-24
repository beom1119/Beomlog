package com.Beomlog.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;

    private String content;

    private boolean completed;

    private LocalDateTime localDateTime;


    public Todo(Long id, String title, String content, boolean completed, LocalDateTime localDateTime) {
        Id = id;
        this.title = title;
        this.content = content;
        this.completed = completed;
        this.localDateTime = localDateTime;
    }
}
