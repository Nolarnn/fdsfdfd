//Nolan Myers
import java.util.*;
public class Chapter5 {
	
	public static void main (String[] args) {
		
		//5.9
		//printFactors(12);
		
		//5.11
		//threeHeads();
		
		//5.18
		//digitSum(20);
		
		//5.24
		isAllVowel("aioeu");
		
	}
	
	public static void printFactors(int num){
		int fac1 = 1;
		int fac2 = 1;
		String factors = "1";
		boolean isfactors = false;
		
		//how many numbers to go through and for math
		int totalnums = num - 1;
		int mathtotalnums = totalnums;
		//starting number is fac1
		
		for (int j = 1; j <= totalnums; j++) {
			fac2 = 1;
			while (fac2 != num){
				for (int i = 1; i <= totalnums; i++) {
					if (num == fac1 * fac2) {
						isfactors = true;}
					if (isfactors && fac1 != 1) {
						factors = factors + " and " + fac1;}
						fac2++;
						isfactors = false;
				}
			}
			fac1++;
		}
		factors = factors + " and " + num;
		System.out.println(factors);
		}

	public static void threeHeads(){
		boolean done = false;
		String H = "H";
		String T = "T";
		Random r = new Random();
		int headnum = 0;
		while (done == false) {
			int num = r.nextInt(3);
			//1 is Heads and 2 is Tails
			if (num == 2) {
				System.out.print(T + " ");
				headnum = 0;}
			if (num == 1) {
				System.out.print(H + " ");
				headnum++;
				}
			if(headnum == 3){
				done = true;
				}
			}
		System.out.println("\nCongrats on three Heads in a row!");
		}

	public static void digitSum(int num){
		int newnum = num;
		int total = 0;
		boolean numisfound = false;
		
	}
	
	public static void isAllVowel(String word){
		String vowel = "aeiou";
		char a = vowel.charAt(0);
		char e = vowel.charAt(1);
		char i = vowel.charAt(2);
		char o = vowel.charAt(3);
		char u = vowel.charAt(4);
		boolean isvowel = false;
		boolean done = false;
		int length = word.length();
		System.out.println(length);
		int num = 0;
		
		
			for (int j = 0; j <= length; j++) {
				char letter = word.charAt(j);
				char lletter = Character.toLowerCase(letter);
				if (letter != a) {
					}
				}
		}
}


