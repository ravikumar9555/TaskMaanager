package com.taskmanger.entity;

public class TaskEntity {
 
	private long taskID;
	private String taskName;
	private String description;
	public TaskEntity(long taskID, String taskName, String description) {
		super();
		this.taskID = taskID;
		this.taskName = taskName;
		this.description = description;
	}
	public long getTaskID() {
		return taskID;
	}
	public void setTaskID(long taskID) {
		this.taskID = taskID;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "TaskEntity [taskID=" + taskID + ", taskName=" + taskName + ", description=" + description + "]";
	}
	
	
	
	
}
