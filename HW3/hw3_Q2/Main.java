public class Main {
public static void main(String[] args) {
	// write your code here
    SadObject sad = new SadObject();
    HappyObject happy = new HappyObject();
    psychiatrist doctor = new psychiatrist();
    doctor.examine(sad);
    sad.expressFeelings();
    doctor.observe(sad);
    doctor.examine(happy);
    happy.expressFeelings();
    doctor.observe(happy);
    }
}
