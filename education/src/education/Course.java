package education;

public class Course {
	private int id;
	private String CourseName;
	private String CourseHours;
	private int Grade;
	private String Instructor;
	
	public Course() {
		super();
	}
	public Course(int id, String courseName, String courseHours, int grade, String instructor) {
		super();
		this.id = id;
		CourseName = courseName;
		CourseHours = courseHours;
		Grade = grade;
		Instructor = instructor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getCourseHours() {
		return CourseHours;
	}
	public void setCourseHours(String courseHours) {
		CourseHours = courseHours;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	public String getInstructor() {
		return Instructor;
	}
	public void setInstructor(String instructor) {
		Instructor = instructor;
	}
	
	
	

}
