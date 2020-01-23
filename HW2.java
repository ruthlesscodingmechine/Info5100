/* Deadline 24 Jan, Friday, 11:59PM.
   * Extra credit points will be added if total points are less than 10.
   * Try every question and keep practicing from other online sites.
   * Contact us if any assistance is needed.
   */


1) Write a method to take a String and character as input and find how many characters are in the String
	Example #1
		Input : "North", 'r'
		Output : "North" has 1 'r'

  public int countChar(String str, character char){
    int count = 0;
    for(int i = 0; i < str.length(); i ++){
      if(str.charAt(i) == char){
        count ++;
      }
    }
    return count;
  }
2) Write a method to find the maximum and minimum number in an array of numbers
	Example:
		Input : [3, 5, 7, 1, 4, 32, 15]
		Output : Max is 32 and Min is 1

  public void findMaxAndMin(int[] a1){
    if(a1.length == 0){
      System.out.println("input array is empty");
    }
    int min = a1[0], int max = a1[0];
    for(int i = 0; i < a1.length; ++i){
      if(min > a1[i]){
        min = a1[i];
      }
      if(max < a1[i]){
        max = a1[i];
      }
    }
    System.out.println("Max is max and Min is min");
  }

3) Write a java function that adds all the digits of an integer until it is single digit.
		i. function takes an integer as input and returns its sum of digits.
		ii. for example input = 37, sum = 3+7 = 10, sum = 1+0 = 1. result = 1.

		Here is the prototype you can work with

		public int addDigits (int input){
      int result = 0;
      while(result >= 10 || input != 0){
        if(input == 0 && result >= 10){
          input = result;
          result = 0;
        }
        result = result + input % 10;
        input = input / 10;
      }
    return result;
		}


4) Question

public class Assignment2 {
	    // Assignment
	    /**
	     * Write a method to calculate the Social Security Tax of an employee and print it.
	     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
	     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
	     */
	    public double socialSecurityTax(Employee employee) {
	        //write your code here
          double tax = 0.0;
          if(employee.salary <= 8900){
            tax = employee.salary * 0.062;
          }
          else{
            tax = 106800 * 0.062;
          }
	    	return tax;
	    }

       /**
	     * Write a method to calculate an employee's contribution for insurance coverage and print it.
	     * Amount of deduction is computed as follows:
	     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
	     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
	     */
	    public static double insuranceCoverage(Employee employee) {
	        //write your code here
          double contribution = 0.0;
          if(employee.age < 35){
            contribution = 0.03 * employee.salary;
          }
          else if(employee.age >= 35 && employee.age <= 50){
            contribution = 0.04 * employee.salary;
          }
          else if(employee.age > 50 && employee.age < 60){
            contribution = 0.05 * employee.salary;
          }
          else{
            contribution = 0.06 * employee.salary;
          }
          return contribution;
	    }


	    /**
	     * Write a method to sort three employees' salary from low to high, and then print their name in order.
	     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
	     * John Alice Jenny
	     */
	    public void sortSalary(Employee e1, Employee e2, Employee e3) {
	        //write your code here
        if(e1.salary > e2.salary && e1.salary > e3.salary){
          if(e2.salary > e3.salary){
            System.out.println(e3.name + ' ' + e2.name + ' ' + e1.name);
          }
          else{
            System.out.println(e2.name + ' ' + e3.name + ' ' + e1.name);
          }
        }
        else if(e2.salary > e1.salary && e2.salary > e3.salary){
          if(e1.salary > e3.salary){
            System.out.println(e3.name + ' ' + e1.name + ' ' + e2.name);
          }
          else{
            System.out.println(e1.name + ' ' + e3.name + ' ' + e2.name);
          }
        }
        else{
            if(e1.salary > e2.salary){
              System.out.println(e2.name + ' ' + e1.name + ' ' + e3.name);
            }
            else{
              System.out.println(e1.name + ' ' + e2.name + ' ' + e3.name);
            }

        }
	    }

//Extra credit


	    /**
	     * I have written some code below. What I want is to swap two Employee objects.
	     * One is Jenny and one is John. But after running it, I got the result below:
	     * Before: a=Jenny
	     * Before: b=John
	     * After: a=Jenny
	     * After: b=John
	     * There is no change after swap()! Do you know the reason why my swap failed?
	     * Write your understanding of the reason and explain it.
	     */

	     write your understanding here.
	     Your Answer:
       The "swap()" method copies the references of the two Employee objects in its local variables x and y,
       then swaps the two local variables. But it has no influence either on the original references(a and b) or
       the two Employee objects.
       


	    public static void main(String[] args) {
	        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
	        Employee b = new Employee("John", 30, Gender.MALE, 2500);
	        System.out.println("Before: a=" + a.getName());
	        System.out.println("Before: b=" + b.getName());
	        swap(a, b);//
	        System.out.println("After: a=" + a.getName());
	        System.out.println("After: b=" + b.getName());
	    }


	    public static void swap(Employee x, Employee y) {
	        Employee temp = x;
	        x = y;
	        y = temp;
	    }
	}
