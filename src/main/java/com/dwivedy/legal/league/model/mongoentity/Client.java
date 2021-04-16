package com.dwivedy.legal.league.model.mongoentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "client")
@Data
public class Client {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String clientName;
	
	private String caseInfo;
	
	private int fee;
	
	 

}
