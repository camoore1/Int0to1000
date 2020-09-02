import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer between 0 and 1000");

    int x = sc.nextInt();

    int ones = x % 10;
    int tens = (x % 100 - ones)/10;
    int hundreds = (x % 1000 - tens)/100;
    
    int answer = ones*tens*hundreds;
    System.out.println(answer);
  }
}