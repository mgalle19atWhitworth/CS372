
public class Teacher extends Person {

int gradeLevel;
String certification;

public void Person(String newName,String newPhoneNumber,int newAge,int newGradeLevel,String NewCertification){
	name = newName;
	age= newAge;
	phoneNumber = newPhoneNumber;
	gradeLevel = newGradeLevel;
	certification = NewCertification;
}
}
