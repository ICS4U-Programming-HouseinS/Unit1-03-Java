import java.util.Scanner;
  
class microwave {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter 1 for sub, 2 for pizza or 3 for soup");
    String userFood = myObj.nextLine();
    double time = 0;
    if (userFood.equals("1")) {
      time = 60d;
      System.out.println(time);
    } else if (userFood.equals("2")) {
      time = 45d;
      System.out.println(time);
    } else if (userFood.equals("3")) {
      time = 105d;
      System.out.println(time);
    } else { 
      System.out.println("error");
    }
    
    System.out.println("How many items do you have?");
    String userQuantity = myObj.nextLine();
      
    if (userQuantity.equals("1")) {
      time = time;
    } else if (userQuantity.equals("2")) {
      time = time * 1.5d; 
    } else if (userQuantity.equals("3")) {
      time = time * 2d;
    } else {
      System.out.println("error");
    }
    int minAsInt = (int) time / 60;
    System.out.println("It will take " + minAsInt + "min " + time % 60  + "sec to cook");
  }
}