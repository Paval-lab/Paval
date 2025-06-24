import java.lang.String;
class stu {
    String name;
    int rollnumber;
    int marks;

    public stu(String name, int rollnumber, int marks){
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }
    public void info() {
        System.out.println("Name of  the student: " + this.name);
        System.out.println("Rollnumber of the student: " + this.rollnumber);
        System.out.println("Marks of the student: " + this.marks);
    }
}

    public class student {
        public static void main(String[]Args) {
            int studentinfo = 3;

            stu student1 = new stu("Paval", 1, 85);
            stu student2 = new stu("Indhu", 02, 99);
            stu student3 = new stu("selva", 03, 80);

            System.out.println("student1 name: " + student1.name);
            System.out.println("student1 rollnumber: " + student1.rollnumber);
            System.out.println("student1 marks: " + student1.marks);
            student1.info();

            System.out.println("student2 name: " + student2.name);
            System.out.println("student2 rollnumber: " + student2.rollnumber);
            System.out.println("student2 marks: " + student2.marks);
            student2.info();

            System.out.println("student3 name: " + student3.name);
            System.out.println("student3 rollnumber: " + student3.rollnumber);
            System.out.println("student3 marks: " + student3.marks);
            student3.info();
           

        }
        
    }


    