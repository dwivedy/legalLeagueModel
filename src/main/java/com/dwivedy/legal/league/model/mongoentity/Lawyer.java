package com.dwivedy.legal.league.model.mongoentity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document
@Data
public class Lawyer {
	
	@Id
	private ObjectId id;
	
	private String lawyerName;
	
	private List<String> expertiseSkills;
	
	private Integer fee;
	
	private List<Client> clients;
	

}
