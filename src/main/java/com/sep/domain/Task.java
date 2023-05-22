package com.sep.domain;

import jakarta.persistence.*;

@Entity
public class Task
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Project belongsTo;
    private String title;
    @ManyToOne
    private User owner;

    public Task() {
    }

    public Task(Long id, Project belongsTo, String title, User owner) {
        this.id = id;
        this.belongsTo = belongsTo;
        this.title = title;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Project getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(Project belongsTo) {
        this.belongsTo = belongsTo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
