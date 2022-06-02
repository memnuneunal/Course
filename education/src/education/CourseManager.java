package education;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    
	List<LogServices> logServices ;
	
	List <Course> courses;
	
	public CourseManager(List<LogServices> logServices) {
		
		this.logServices = logServices;
		
		courses =new ArrayList<Course>();
		
	}
	public void log(String logMessage) {
		for (LogServices logs : this.logServices) {
			logs.log(logMessage);
			
			
		}
		
	}
	

	
	
	
	public void add(Course course) {
		
		
		if(!checkIfCourseNameExists(course.getCourseName())) {
			
		log("Memnune ekledi.");
			courses.add(course);
			
		    System.out.println("Eklendi.");
		}else {
			System.out.println("Course Name is in list.");
		}
		
		
	}
	
	
	
	private boolean checkIfCourseNameExists (String courseName){
		
		boolean exists=false;
		
		for (Course item : courses) {
			
			if(item.getCourseName()==courseName) {
				
				exists=true;
			}
			
		}
		return exists;
		
		
		
	}
	
	public List<Course> getAll(){
		return courses;
	}
	
	public void delete(Course course) {
		log("Memnune sildi.");
	    //getLogAll();
		
		courses.remove(getById(course.getId()));
		
		
	}
	private Course getById(int id) {
		
		Course control=null;
	
		for (Course items : courses) {
			
			if(items.getId()==id) {
				control=items;
				
			}
			
			
		}
		return control;
		
	}
}
