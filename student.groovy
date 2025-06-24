class student {
    string name;
    string rollnumber;
    string marks;

    public student(string name, string rollnumber, string marks){
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }
    public void info() {
        System.out.println("Name of  the studennt: " + this.name);
        System.out.println("Rollnumber of the student: " + this.rollnumber)
        System.out.println("Marks of the student: " + this.marks)
    }
}

    public class Main{
        public static void main(String[]Args) {
            int studentinfo = 3;

           student student1 = new student("Paval", 01, 85);
           student student2 = new student("Indhu", 02, 99);
           student student3 = new student("Prarthana", 03, 80);

           System.out.println("student1 name" + student1.name);
           System.out.println("student1 rollnumber" + student1.rollnumber);
           System.out.println("student1 marks" + student1.marks);
           student1.info();

           System.out.println("student2 name" + student2.name);
           System.out.println("student2 rollnumber" + student2.rollnumber);
           System.out.println("student2 marks" + student2.marks);
           student2.info();

           System.out.println("student3 name" + student3.name);
           System.out.println("student3 rollnumber" + student3.rollnumber);
           System.out.println("student3 marks" + student3.marks);
           student3.info();
           

        }
        
    }


    