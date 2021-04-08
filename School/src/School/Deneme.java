package School;
import java.time.LocalTime;
import java.time.LocalDate;

public class Deneme {
    public static void main(String[] args) {
        SchoolType s = SchoolType.Acik_Ogretim_Lisesi;
        SchoolType deneme1 = SchoolType.Sosyal_Bilimler_Lisesi;
        System.out.println(deneme1.getSchoolTypeId());
        System.out.println(s.getSchoolTypeName());

        AffiliatedInstitution a = AffiliatedInstitution.Devlet;
        System.out.println(a.getAffiliatedInstitutionID());
        System.out.println(a.getAffiliatedInstitutionName());

        ClassNumber c = ClassNumber.On;
        System.out.println(c.getClassNumberId());

        ClassName deneme = ClassName.A;
        System.out.println(deneme.getClassName());
        
        Student z = new Student("Zeynep","Bulut", "57931113156" , 160503120, c.getClassNumberId(),deneme.getClassName());
        
        System.out.println(z.getName());
        System.out.println(z.getSurname());
        System.out.println(z.getPersonalId());
        System.out.println(z.getStudentNumber());
        System.out.println(z.getClassNumber());
        System.out.println(z.getClassName());
        LocalDate entranceDate = LocalDate.now(); // Create a date object
        //System.out.println(entranceDate); // Display the current date
        LocalTime entranceTime = LocalTime.now();
        //System.out.println(entranceTime);
        
    }

}
