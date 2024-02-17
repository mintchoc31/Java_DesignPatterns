package observer;

import java.util.ArrayList;
import java.util.List;

public class Student {

	public static void main(String[] args) {
		Student student = new Student();	// 공부를 하려는 Student
		Observer observer = new Observer(student);	// Student를 감시하는 Observer
		// Observer 생성자에 Student 객체를 파라미터로 주입하고, 
		// 해당 Student가 공부를 시작하면 등록된 Observers에게 그 사실을 알려준다.
		
		student.setStudyHours(3); // output: Current conditions: 3 hours
	}
	
	private List<Observer> observers;
	private int studyHours;
	
	public Student() {
		observers = new ArrayList<>();
	}
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
	}
	
	public void setStudyHours(int studyHours) {
		this.studyHours = studyHours;
		startStudy();
	}
	
	public void startStudy() {
		notifyObservers();
	}
	
	public int getStudyHours() {
		return studyHours;
	}
}
