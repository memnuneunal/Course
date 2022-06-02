package education;

public class Instructor {

	
	int id;
	String Name;
	String LastName;
	String CourseInformation;
	int LessonHours;
	
	
	
	public Instructor() {
		super();
	}
	
	public Instructor(int id, String name, String lastName, String courseInformation, int lessonHours) {
		super();
		this.id = id;
		Name = name;
		LastName = lastName;
		CourseInformation = courseInformation;
		LessonHours = lessonHours;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCourseInformation() {
		return CourseInformation;
	}
	public void setCourseInformation(String courseInformation) {
		CourseInformation = courseInformation;
	}
	public int getLessonHours() {
		return LessonHours;
	}
	public void setLessonHours(int lessonHours) {
		LessonHours = lessonHours;
	}
	
}
