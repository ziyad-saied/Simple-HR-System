package ziyad;

import java.util.Scanner;

public class ziyad {
                           /*welcome list*/	
	static int choice;	
	public static  void welcome() {
		Scanner sc=new Scanner(System.in);
		System.out.println("For HR press: 1");
		System.out.println("For PayRoll press: 2");
		System.out.println("For Manager press: 3");
		System.out.println("To exit press: 0");
		System.out.println("Enter your choice please ");
		System.out.println();
		choice=sc.nextInt();
		choice(choice);
	}
	                      /*choices list*/
	public static  int choice(int choice) {
		Scanner sc=new Scanner(System.in);
         if(choice==1) {
        	 HR ();
         }
         if(choice==2) {
        	 PayRoll ();
         }
         if(choice==3) {
        	 Manager ();
         }
		if(choice==0) {
			Exit();
		}
		else {
			System.out.println("You enter a worng number please try again :::  ");
			
		}
		return choice;
	}
	public static  void HR() {
		Scanner sc=new Scanner(System.in);
		System.out.println("For enter new employee press: 1");
		System.out.println("For previous choices press:   2");
		choice=sc.nextInt();
				switch(choice) {
				case 1:
					
					System.out.println("Employee name is ");
		            String employee;
		            employee=sc.next();
		            System.out.println("Employee name is entered successfully ");
		            HR();
		      		break;
				
				case 2:
			welcome();
			choice(choice);
			break;
		}
		}
	public static void PayRoll() {
		Scanner sc=new Scanner(System.in);
		System.out.println("For enter new payroll press:  1");
		System.out.println("For previous choices press:   2");
		choice=sc.nextInt();
				switch(choice) {
				case 1:
					
					System.out.println("The PayRoll is ::  ");
		            String payroll;
		            payroll=sc.next();
		            System.out.println("The PayRoll u entered is : "+payroll);
		    		PayRoll();
		      		break;
				
				case 2:
			welcome();
			choice(choice);
			break;
		}
		}
	public static  void Manager() {
		Scanner sc=new Scanner(System.in);
		System.out.println("For book new appointment press 1");
		System.out.println("For previous choices press   2");
		choice=sc.nextInt();
				switch(choice) {
				case 1:
					
					System.out.println("When do you want to meet the manager ?   ");
		            String AppointmentDay;
		            AppointmentDay=sc.next();
		            System.out.println("What is time do you want to meet him  ?");
		            int AppointmentHour;
		            AppointmentHour=sc.nextInt();
		            
		            System.out.println("The manager will be waiting for you on  : "+AppointmentDay+" AT "+ AppointmentHour +"Pm");
		    		PayRoll();
		      		break;
				
				case 2:
			welcome();
			choice(choice);
			break;
		}
	}
	public static void Exit() {
		switch(choice) {
		case 0:
		System.out.println("Thanks");
		break;
		case 2:
			welcome();
			choice(choice);
			break;
		}
		
	}
	public static void main(String [] args) {
		
		System.out.println("Welcome ");
		
		int choice = 0;
		welcome();
		choice(choice);
	}	
	}
/*ZIYAD SAIED */
		