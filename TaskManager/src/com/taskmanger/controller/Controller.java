package com.taskmanger.controller;

import java.util.ArrayList;
import java.util.List;

import com.taskmanger.entity.TaskEntity;

public class Controller {

	private List<TaskEntity> tasks;
	
	public Controller() {
		tasks=new ArrayList<>();
	}
	
	public void addTask(TaskEntity task)
	{
		tasks.add(task);
	}
	
	public void removeTask(int index) {
		tasks.remove(index);
		}
	
	public TaskEntity getTask(int index)
	{
		
		return tasks.get(index);
	}
	
	public List<TaskEntity> getAllTask()
	{
		return tasks;
	}
	
	public void updateTask(int index,String taskName,String description)
	{
		TaskEntity task=tasks.get(index);
		task.setTaskName(taskName);
		task.setDescription(description);
	}
}
