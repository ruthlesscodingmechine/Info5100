public class Course {
    public String title;
    public int numberOfStudent;
    public Student[] students;

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
        else{
            System.out.println("You cannot register because class is full");
        }
    }
}
