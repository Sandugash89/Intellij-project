package class21.HW;

public class StudentTester {
    public static void main(String[] args) {
        Student[] studentTester = {new CollegeStudent(), new SyntaxStudent(), new SchoolStudent()};
        for (Student student : studentTester) {
            student.study();
            student.read();
            student.write();
        }
        Student student = new SyntaxStudent();
        SyntaxStudent s = (SyntaxStudent) student;
        s.onlineStudy();

        Student student1 = new SchoolStudent();
        SchoolStudent schoolStudent = (SchoolStudent) student1;
        schoolStudent.go();

        Student student2= new CollegeStudent();
        CollegeStudent collegeStudent= (CollegeStudent) student2;
        collegeStudent.goToCollege();


        }

    }

