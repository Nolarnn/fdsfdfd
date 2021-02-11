//Nolan Myers
import java.util.*;
import java.io.*;
public class Chapter4 {
	public static void main(String[] args) {
		System.out.println("Working...");
		
		//4.8
		//smallestLargest();
		
		//4.11
		longestName();
		
		//4.18
		//wordCount();
		}
	
	public static void smallestLargest(){
		int max = 0;
		int min = 999999999;
		int a = 1;
		Scanner console = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		int numnum = console.nextInt();
		for (int i = 1; i <= numnum; i++) {
			System.out.print("Number " + i + ": ");
			int num = console.nextInt();
			if (num >= max) {
				max = num; }
			if (num <= min) {
				min = num; }
			
			}
		System.out.println("Smartest = " + min);
		System.out.println("Largest = " + max);	
		}
	
	public static void longestName() {
		String longName = "Preset";
		int loong = 0;
		System.out.println("How many names would you like to enter?");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("name #" + i + "?");
			String name = console.next();
			int length = name.length();
			if(length > loong) {
			longName = name;
			loong = length;
			}
			}
		if (Character.isUpperCase(longName.charAt(0)) = false) {
			int b = longName.charAt(0);
			int c = Character.toUppercase(c.charAt(0));
			longName = longName.replace(b,c);
			}
		
		System.out.println(longName + " is the Longest name");
		}

	public static void wordCount() {
		System.out.println("What would you like to count the words of?");
		Scanner console =  new Scanner (System.in);
		String line = console.next();
		int numword = 0;
		boolean letterbefore = false;
		int last = line.length() - 1;
		
		
		for (int i = 0; i < line.length(); i++) {
			if (Character.isLetter(line.charAt(i))) {
				letterbefore = true;
				}
			if (line.charAt(i) == ' ') {
				numword++;
				System.out.println("after first it is" + numword);
				letterbefore = false;
				}
			if (Character.isLetter(line.charAt(i)) & i == last){
				numword++; 
				}
			
			}
		System.out.println(numword);
		
	}
}


