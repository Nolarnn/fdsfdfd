//@author Nolan Myers

import java.util.*;

public class FinalJava {
	
	public static void main(String[] args){
		intro();
		
		
		}
	public static void intro() {
		boolean done = false;
		Scanner input = new Scanner(System.in);
		System.out.println("\nThis program calculates properties of beams and the results of an applied load assuming simply supported ends.\n");
		while (!done){
			System.out.println("Enter the number corresponding to your choice:\n1. Create Beam\n2. Set up Custom Material");
			int num = input.nextInt();
			if (num == 1){
				typebeam();
				done = true;
				}
			else if (num == 2){
				cMaterial();
				done = true;}
			else{
				System.out.println("\nInput not available, please try again");

				}
			}
		}
		
	public static void typebeam(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("\nWhat is the type of beam? Enter the number corresponding to your choice.\n1. Rectangular/Square Solid\n2. Round Bar (Circular Solid)\n3. Pipe (Hollow Circular Section)");
		int num = input.nextInt();
		if (num == 1){
			Beam beam = new Beam("Rectangle");
			
			}
		else if (num == 2){
			Beam beam = new Beam("Circle");
			}
		else if (num == 3){
			Beam beam = new Beam("Pipe");
			}
		else {
			System.out.println("\nInput not available, please try again");
			typebeam();
			}
	}
	
	public static void cMaterial(){
		Beam creation = new Beam("cMaterial");
		intro();
		}
	public static void testf(){
		}
	
}
