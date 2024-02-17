package observer;

public class Observer {
	private Student student;
	private int studyHours;
	
	public Observer(Student student) {
		this.student = student;
		student.registerObserver(this);
	}
	
	public void update() {
		studyHours = student.getStudyHours();
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + studyHours + " hours");
	}

}
