//Nolan Myers
import java.util.*;

import java.lang.*;
public class Chapter3 {
	
	public static void main(String[] args) {
		// 3.3
		printPowersofN(4, 3);
		printPowersofN(5, 6);
		printPowersofN(-2,8);
		
		//3.10
		area(2.0);
		
		//3.15
		sphereVolume(2.0);
		
		//3.20
		inputBirthday();
	}
	
	public static void printPowersofN(int a, int b) {
		
		int c = 1;
		b += 1;
		for (int i = 1; i <= b; i++) {
			
			System.out.print(c + " ");
			c = a * c;
			}
			System.out.println();
		}

	public static void area(double a) {
		System.out.println();
		double b = Math.pow(a, 2);
		System.out.println(Math.PI * b);
		}
	
	public static void sphereVolume(double a) {
		System.out.println();
		
		double b = Math.PI * Math.pow(a,3) * 4/3;
		System.out.println(b);
		}

	public static void inputBirthday(){
		System.out.println();
		Scanner console = new Scanner(System.in);
		System.out.println("On what day of the month were you born?");
		int num = console.nextInt();
		System.out.println("Which month were you born in?");
		String month = console.next();
		System.out.println("What year were you born in?");
		int year = console.nextInt();
		System.out.println("You were born on " + month + " " + num + ", " + year + ". Wowzer");
		}
}



