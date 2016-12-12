package factory;

abstract class PersonFactory{  
	public abstract  Person  producePerson();  
	public static PersonFactory getInstance(String classname) {     
		PersonFactory personFactory = null;      
		try {      
			personFactory = (PersonFactory) Class.forName(classname).newInstance();      
		} catch (Exception e) {      
			e.printStackTrace();      
		}      
		return personFactory ;      
	}  
}  