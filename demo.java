import java.util.Scanner;
class demo{
public static void main(String[]args){
Scanner ob = new Scanner(System.in);
System.out.println("Enter your salary :");
int salary = ob.nextInt();
System.out.println("Enter your age :");
int age = ob.nextInt();
if(salary>=25000 || age<=25){
System.out.println("You are eligible");
System.out.println("Enter the required loan amount :");
int loan = ob.nextInt();
if(loan<=50000){
System.out.println("Loan available please share your details");
}
else{
System.out.println("The maximum amount is 50000");
}}
else{
System.out.println("You are not eligible");
}}}

