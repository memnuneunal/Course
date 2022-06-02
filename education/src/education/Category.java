package education;

public class Category {

	private int id;
	private String InstructorDefine;
	private String CourseDefine;
	
	public Category() {
		super();
	}
	public Category(int id, String instructorDefine, String courseDefine) {
		super();
		this.id = id;
		InstructorDefine = instructorDefine;
		CourseDefine = courseDefine;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstructorDefine() {
		return InstructorDefine;
	}
	public void setInstructorDefine(String instructorDefine) {
		InstructorDefine = instructorDefine;
	}
	public String getCourseDefine() {
		return CourseDefine;
	}
	public void setCourseDefine(String courseDefine) {
		CourseDefine = courseDefine;
	}
	
	
}
