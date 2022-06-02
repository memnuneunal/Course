package education;

import java.util.ArrayList;
import java.util.List;



public class InstructorManager {
	
     List<Instructor> instructors;
	
	public InstructorManager() {
		instructors =new ArrayList<Instructor>();
		
	}
	public void add(Instructor instructor) {//Ürün eklendiðinde tekrar etmeyecek
	
		   if(!checkIfInstructorNameExists(instructor.getName())) {

				instructors.add(instructor);
			}
			else {
				System.out.println("Intructor is in list.");
			}
			
	}

	
	private boolean checkIfInstructorNameExists(String instructorName){
		
		boolean exists=false;
		for (Instructor item :instructors) 
		{
			if(item.getName()==instructorName) {
				exists=true;
			}
		}
		return exists;
		
	}

	
	public List<Instructor> getAll(){
		
		return instructors;
	}
	
	
   public void delete(Instructor instructor ) {
	 
	   instructors.remove(getById(instructor.getId()));
	
	
   }


   private Instructor getById(int id) {
	   Instructor instructorToFind = null;
		  for (Instructor item : instructors) {
			  if(item.getId()==id)
				 instructorToFind=item;
			
		}
		  return instructorToFind;
	   
   }
   
   public void update(Instructor instructor) {
	   
	  // Instructor productToUpdate= getById(instructor.getId());

	   
   }




}
