package com.example.csci3130_baseproject;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Course {
    private String name, id, department, semester;
    private Date drop_deadline, current;
    private ArrayList<User> waitlist;
    private int capacity;
    private  ArrayList<User> students ;

    public Course (){

    }
    //    public Course(String n, String ID, String dept, int t, int capacity){
//        setName(n);
//        setId(ID);
//        setDepartment(dept);
//        setCapacity(capacity);
//
//    }
    public boolean isFull(Course c){
        if (c.getCapacity() > capacity){
            return true;
        }
        else
            return false;
    }
    //    public void addStudent(Course course){
//    	if (students.size()>= capacity){
//    		if (waitlist.size() >= 10){
//    			System.out.print("Course is full");
//    		}
//    		else if (waitlist.size() < 10){ //fixed sized wait list
//
//    		}
//    	}
//    	else if ()
//    }
    public int studentsNum(){
        return students.size();
    }
    public ArrayList<User> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<User> students) {
        this.students = students;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name  = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id  = id;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public ArrayList<User> getWaitlist() {
        return waitlist;
    }
    public int waitlistSize() {
        return waitlist.size();
    }
    public void setWaitlist(ArrayList<User> waitlist) {
        this.waitlist = waitlist;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public Date getDrop_deadline() {
        return drop_deadline;
    }
    public void setDrop_deadline(Date drop_deadline) {
        this.drop_deadline = drop_deadline;
    }
    public Date getCurrent() {
        return current;
    }
    public void setCurrent(Date current) {
        this.current = current;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public String getSemester() {
        return semester;
    }
    public String viewCourseInfo() {
        return this.getDepartment() + "\tSemester: " + this.getSemester() + "\n" + this.getId() + ": " + this.getName() + "\n"
                + "Capacity: " + this.getCapacity();}
    }
