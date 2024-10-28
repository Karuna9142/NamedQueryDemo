package com.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = "findname", query="Select s from Student s")
public class Student
{
//@generatedvalue annotation primary key will automatically generated
////OPTIONAL thing if we remove this it won't give error
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private int id;
private String name;
private int age;

public Student()
{
	super();
}
public Student(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}



}
