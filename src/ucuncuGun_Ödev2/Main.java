
package ucuncuGun_�dev2;

public class Main {

	public static void main(String[] args) {
		Instructor �nstructor2 = new Instructor(26,"Yaz�l�m Uzman�");
		�nstructor2.setFirstName("Buse");
		�nstructor2.setLastName("Ayd�n");
		InstructorManager manager = new InstructorManager();
		manager.lading(�nstructor2);
		
	
		Student manager3 = new Student(296,"3.G�n�n �devi");
		manager3.setFirstName("K�bra");
		manager3.setLastName("Arslan");
		StudentManager student = new StudentManager();
		student.add(manager3);
		
		
		UserManager manager2 = new UserManager();
		manager2.entery(�nstructor2);
		manager2.entery(manager3);
		
	}

	}


