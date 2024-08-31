package _01_02b;


public class Employee {

  public static void main(String[] args) {
    // Create a variable called age of type int and assign it the value 29.

    // Print the age variable to the console.

    // Create a variable called isAManager of type boolean and assign it the value
    // true.

    // Print the isAManager variable to the console. int age = 29;
    int age = 29;
    System.out.println("The person's age is: " + age);

    Boolean isAManager = true;

    if(isAManager == true){
     System.out.println("The person is a manager.");
     System.out.println("True");
     System.out.println(isAManager);
    }
    else{
      System.out.println("The person is not a manager.");
      System.out.println("False");
      System.out.println(isAManager);
    }

    // Create a variable called yearsOfService of type double and assign it the
    // value 2.5.

    // Print the yearsOfService variable to the console.
    double yearsOfService = 2.5;
    System.out.println("Years of service: " + yearsOfService);
    System.out.println(yearsOfService);


    // Create a variable called baseSalary of type int and assign it the value 3000.
    int baseSalary = 3000;

    // Create a variable called overtimePayment of type int and assign it the value
    // 40.
    int overtimePayment = 40;

    // Create a variable called totalPayment of type int and assign it to the value
    // of baseSalary added to overtimePayment.
    int totalPayment = baseSalary + overtimePayment;

    // Print the totalPayment variable to the console.
    System.out.println(totalPayment);

    // Create three variables all of type double on a single line.
    // They should be called firstBonus, secondBonus and thirdBonus and they should
    // be assigned the values 10.00, 22.00 and 35.00.
    double firstBonus = 10.00, secondBonus = 22.00, thirdBonus = 35.00;

    // Print out the sum of the variables called firstBonus, secondBonus and
    // thirdBonus.
    System.out.println(firstBonus + secondBonus + thirdBonus);

  }

}
