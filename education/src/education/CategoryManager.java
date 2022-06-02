package education;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
	
	List <Category> categorys;
	
	public CategoryManager () {
		
		categorys =new ArrayList<Category>();
		
	}
	/*public void add(Category category) {
		if(checkIfCategory()
		
	}*/
   
	private boolean checkIfCategory(String InstructorDefine) {
		boolean exists=false;
		for (Category item : categorys) {
			if(item.getInstructorDefine()==InstructorDefine) {
				exists=true;
				
			}
			
		}
		return exists;
	}
}
