package education;

import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		Instructor instructor1=new Instructor(1,"Engin","Demirog","Yazýlým",4);
		
		InstructorManager instrucManager =new InstructorManager();
		Instructor instructor2=new Instructor(2,"Ahmet","Er","Matematik",4);
		Instructor instructor3=new Instructor(1,"Ömer","Genç","Edebiyat",4);

		instrucManager.add(instructor1);
		instrucManager.add(instructor2);
		instrucManager.add(instructor3);
		
		Course course1=new Course(1,"a","b",2,"e");
		
		List<LogServices> logServices =new ArrayList<LogServices>();
		
		
		//CourseManager courseManager =new CourseManager(new SMS());
		     
		logServices.add(new DatabaseLogService());
		logServices.add(new SMSLogServices());
		     
		CourseManager courseManager=new CourseManager(logServices);
		
		courseManager.add(course1);
		courseManager.delete(course1);
	
		
		
		
	  

	}

}
