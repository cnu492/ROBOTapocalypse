package com.robot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Survivor {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private int age;
	
    private String gender;
    
    private String lastLocation;
    
    private String flag;
    
}
