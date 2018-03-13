package dataAccess.database;

import dataAccess.message.MessagePersistentAnemicObject;
import dataAccess.project.AProject;
import dataAccess.sprintTask.Sprint;
import dataAccess.sprintTask.Task;
import dataAccess.user.Employee;

public class DataModel {
	Sprint[] sprints;
	Employee employeeTree;
	MessagePersistentAnemicObject[] messages;
	AProject[] projects;
	Task[] tasks;
}
