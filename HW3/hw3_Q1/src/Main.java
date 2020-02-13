public class Main {

    public static void main(String[] args) {
        // write your code here
        Student s1 = new Student("Peter Parker", 12173);
        Course c1 = new Course("Java");
        c1.registerStudent(s1);
        System.out.println("Number of student:" + c1.numberOfStudent);
        Student s2 = new Student("Pikachu", 12173);
        Student s3 = new Student("AutoMan", 12173);
        Student s4 = new Student("Haimian Baobao", 12173);
        Student s5 = new Student("Paidaxing", 12173);
        Student s6 = new Student("Zhangyu Brother", 12173);
        Student s7 = new Student("Boss Pi", 12173);
        Student s8 = new Student("Luren Jia", 12173);
        Student s9 = new Student("Luren Yi", 12173);
        Student s10 = new Student("Luren Bing", 12173);
        Student s11 = new Student("Luren Ding", 12173);
        c1.registerStudent(s2);
        System.out.println("Number of student:" + c1.numberOfStudent);
        c1.registerStudent(s3);
        System.out.println("Number of student:" + c1.numberOfStudent);
        c1.registerStudent(s4);
        System.out.println("Number of student:" + c1.numberOfStudent);
        c1.registerStudent(s5);
        System.out.println("Number of student:" + c1.numberOfStudent);
        c1.registerStudent(s6);
        System.out.println("Number of student:" + c1.numberOfStudent);
        c1.registerStudent(s7);
        System.out.println("Number of student:" + c1.numberOfStudent);
        c1.registerStudent(s8);
        System.out.println("Number of student:" + c1.numberOfStudent);
        c1.registerStudent(s9);
        System.out.println("Number of student:" + c1.numberOfStudent);
        c1.registerStudent(s10);
        System.out.println("Number of student:" + c1.numberOfStudent);
        c1.registerStudent(s11);
        System.out.println("Number of student:" + c1.numberOfStudent);
        System.out.println("Number of student:" + c1.numberOfStudent);
    }
}
