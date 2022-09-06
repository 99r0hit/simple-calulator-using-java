import java.util.*;

class calculator

{

public static void main(String... main)

{
  
Scanner sc = new Scanner(System.in);

System.out.println("Enter first no. : ");

int a = sc.nextInt();

System.out.println("Enter second no. : ");

int b = sc.nextInt();

System.out.println("Choose from the following : + - * / ");

char operator = sc.next().charAt(0);

switch(operator)

{

case '+':

System.out.print("Addition is : ");

System.out.println(a+b);

break;

case '-':

System.out.print("Substraction is : ");

System.out.println(a-b);

break;

case '*':

System.out.print("Multiplication is : ");

System.out.println(a*b);

break;

case '/':

System.out.print("Division is : ");

System.out.println(a/b);

break;

default:

System.out.println("Invalid input");

}

}

}