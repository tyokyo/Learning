package factory;

public class TeacherFactory extends PersonFactory {     
    @Override      
    public  Person producePerson() {      
        return new Teacher();      
    }      
}     
  