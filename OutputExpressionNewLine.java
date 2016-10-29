/* Program to print the result of the following expressions provided the integer variable a is
20 and b is 10.
int b= a-- - --a;
int c=a--;
int d=a>>2;
int e=a&b;
Required: The output of each expression should get printed in a new line.
*/
//Start of Program
/*Declaring the class*/
public class OutputExpressionNewLine {
	/*  Defining the main method. First line of the execution of the code */
	public static void main(String[] args) {
		int a = 20; //declaring and initializing the integer variable a
		int b = 10; //declaring and initializing the integer variable b
		b = a-- - --a;//a-- holds value 20 and after execution a becomes 19. Now --a value becomes 19-1 = 18. So b = 20-18 = 2
		System.out.println("The value of expression b is \n" + b);
		int c = a--;//a holds the value as 18, but after executing this statement the value of a changes to 17
		System.out.println("The value of expression c is \n" + c);
		int d = a>>2;//Right shift operator by 2 for the value 17 gives the value as 4
		System.out.println("The value of expression d is \n" + d); 
		int e = a&b;// Value of a (17) is 0001 0001 and value of b (10) is 0000 1010. And operation gives 0
		System.out.println("The value of expression e is \n" + e);
	}
}
//End of Program
