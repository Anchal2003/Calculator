import java.util.*;
public class Calculator extends Division {
	public static void main(String[] args){
		
	 System.out.println("Welcome To the Calculator");
	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter first number : ");
	 int number1 = sc.nextInt();
	 System.out.println("");
	 System.out.print("Enter operator : ");
	 char op = sc.next().charAt(0);
	 System.out.print("\n"+"Enter Second number : ");
	 int number2 = sc.nextInt();
	 
	 Calculator obj = new Calculator();
	 if(op=='+'){
	    obj.Add(number1,number2);
	 }
	 else if (op=='-'){
	    obj.Sub(number1,number2);
	 }
	 else if (op=='*'){
	    obj.Mul(number1,number2);
	 }
	 else if (op=='/'){
	    obj.Div(number1,number2);
	 }
	 else{
	    System.out.println("Invalid Operator");
	 }

	}

}