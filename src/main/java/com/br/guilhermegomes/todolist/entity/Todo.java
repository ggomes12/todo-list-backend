package com.br.guilhermegomes.todolist.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@TableGenerator(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    private boolean done;
    private int priority;
    public Todo(String name, String description, boolean done, int priority) {
        this.title = name;
        this.description = description;
        this.done = done;
        this.priority = priority;
    }

    public Todo() {

    }

    public Long getId() {
        return id;
    }

    public Long setId(Long id) {
        this.id = id;
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        this.title = title;
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String setDescription(String description) {
        this.description = description;
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public boolean setDone(boolean done) {
        this.done = done;
        return done;
    }

    public int getPriority() {
        return priority;
    }

    public int setPriority(int priority) {
        this.priority = priority;
        return priority;
    }

}