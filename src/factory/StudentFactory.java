package factory;

public class StudentFactory extends PersonFactory {     
	@Override      
	public Person producePerson() {      
		return new Student();      
	}      
}      