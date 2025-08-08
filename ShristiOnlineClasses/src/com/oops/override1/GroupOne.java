package com.oops.override1;

public class GroupOne extends Project {
	
	public GroupOne(String clientName, String duration, String TLName){
		super(clientName, duration, TLName);
	}

	String[] showTools() {
		String[] tools = {"Java", "Spring", "MySQL"};
		return tools;
	}
}
