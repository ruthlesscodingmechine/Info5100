package exception.hw7;

public class MyIndexOutOfBoundException extends RuntimeException {
      int lowerBound;
      int upperBound;
      int index;
      MyIndexOutOfBoundException(String s) {
          super(s);
      }
      MyIndexOutOfBoundException(int idx, int lb, int ub){
          lowerBound = lb;
          upperBound = ub;
          index = idx;
      }
      public String toString(){
          return "Error Message: Index: " + index + ", but Lower bound: " + this.lowerBound + ", Upper Bound: "
                  + this.upperBound;
      }
}
