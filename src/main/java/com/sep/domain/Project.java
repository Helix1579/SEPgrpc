package com.sep.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import jakarta.persistence.*;

import java.util.List;

@Entity
@JsonPOJOBuilder
@Table(name = "Users")
public class Project
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ProjectName;
    @ManyToOne
    private User owner;
    private boolean isCompleted;
    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "taskId")
    private List<Task> taskList;

    public Project() {
    }

    public Project(Long id, String projectName, User owner, boolean isCompleted, List<Task> taskList) {
        this.id = id;
        ProjectName = projectName;
        this.owner = owner;
        this.isCompleted = isCompleted;
        this.taskList = taskList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
