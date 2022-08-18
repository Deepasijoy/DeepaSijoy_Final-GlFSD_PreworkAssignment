import java.util.Scanner;

public class Main {;

	
	Scanner scan=new Scanner(System.in);
	
	
	public  void checkPalindrome(int inputNumber) {
		
		int temp=inputNumber;
		int reversedNumber=0,rem;
		while(temp!=0) {
			rem=temp%10;
			reversedNumber=reversedNumber*10+rem;
			temp=temp/10;
		}
		//check if orignal no is equal to reversed
				if (inputNumber==reversedNumber) {
					
					System.out.println(inputNumber+""+" Number is Palindrome!");
				}else {
				System.out.println(inputNumber+"Number is not palindrome");	
				}
	}
	
	public  void printPattern(int inputNumber) {
		
		for(int i=1;i<=inputNumber;i++) {
			for(int j=i;j<=inputNumber;j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	
	public  void checkPrimeNumber(int inputNumber) {
		
		int count=0;
		for (int i=2 ; i<= inputNumber-1; i++) {
			if(inputNumber % i==0) {
				count=count+1;
			}
		}
		if(count==0) {
			System.out.println("Number is Prime !");
		}else {
			System.out.println("Number is not Prime!");
		}
		
	}
	
	
	public  void printFibonacciSeries(int inputNumber) {
		
		int a=0;
		int b=1;
		System.out.println(a+" "+b);
		int c;
		for(int i=2; i<= inputNumber; i++) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}
	

	public static void main(String[] args) {
		
		Main obj=new Main();
		int choice;
		Scanner scan=new Scanner(System.in);
		
		do {
		
		System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
		System.out.println();
		
		choice = scan.nextInt();
		
		switch(choice){
		
		case 0 :
		choice=0;
		break;
			
		
		
		case 1:{
			System.out.println("Enter number");
			int inputNumber=scan.nextInt();
			
			obj.checkPalindrome(inputNumber);
		}
			break;
		case 2:{System.out.println("Enter number");
		int inputNumber=scan.nextInt();
			obj.printPattern(inputNumber);
		}
		break;
		case 3:{System.out.println("Enter number");
		int inputNumber=scan.nextInt();
			obj.checkPrimeNumber(inputNumber);
		}
		break;
		case 4:{System.out.println("Enter number");
		int inputNumber=scan.nextInt();
			obj.printFibonacciSeries(inputNumber);
		}
		break;
		
		default:
			System.out.println("Invalid choice.Enter  a valid no.\n");
		
		}	
		

	}
		while(choice!=0);
	System.out.println("Exited Successfully!!!");
	scan.close();
}

}
