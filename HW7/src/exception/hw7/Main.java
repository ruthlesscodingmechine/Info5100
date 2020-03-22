package exception.hw7;

public class Main {

    public static void main(String[] args) {
	// write your code here
    try{
        throw new MyIndexOutOfBoundException(10, 0, 9);
    }catch (Exception ex){
        ex.printStackTrace();
    }
    }
}
