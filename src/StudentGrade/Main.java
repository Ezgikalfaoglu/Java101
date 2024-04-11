package StudentGrade;

public class Main {
    public static void main (String[] args){
        Course mat= new Course("Math", "MATH101", "MATH");
        Course phy= new Course("Physics", "PHY101", "PHY");
        Course chem= new Course("Chemistry", "CHE101", "CHE");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        phy.addTeacher(t2);
        chem.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, phy, chem);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, phy, chem);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, phy, chem);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

    }
}
