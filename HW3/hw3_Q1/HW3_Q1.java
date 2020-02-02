class Test{
public class Student {
            private String name;
            private int ID;

            Student(String Name, int id) {
                this.name = Name;
                this.ID = id;
            }
            public String getName(){
                return this.name;
            }
            public int getID(){
                return this.ID;
            }

            public void setName(String name1) {
                this.name = name1;
            }

            public void setID(int id) {
                this.ID = id;
            }
        }

public class Course {
            private String title;
            private int numberOfStudent;
            private Student[] students;

            public Course(String s1){
                this.title = s1;
                this.numberOfStudent = 0;
                this.students = new Student[10];
            }

            public int getNumberOfStudents() {
                return this.numberOfStudent;
            }

            public String getName() {
                return this.title;
            }

            public Student[] getStudents() {
                return this.students;
            }

            public boolean isFUll() {

                if (this.getNumberOfStudents() >= 10) {
                    return true;
                }
                return false;
            }

            public void registerStudent(Student student1) {
                if (!this.isFUll()) {
                    this.students[numberOfStudent] = student1;
                    this.numberOfStudent ++;
                }
            }
        }


    public static void main(String[] args) {
	// write your code here
        Student s1 = new Student("Peter Parker", 12173);
        Course c1 = new Course("Java");
        c1.registerStudent(s1);
        System.out.println(c1.numberOfStudent);
        System.out.print(c1.students[0].getName());
    }
}
