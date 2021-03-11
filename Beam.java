//@author Nolan Myers
import java.util.*;

public class Beam {
	double width;
	double height;
	double length;
	double sm;
	double area;
	double moi;
	double load;
	double bm;
	double stress;
	double fos;
	double deflection;
	double diameter;
	double od;
	double id;
	String[] names = {"Steel-A36", "Steel-A60", "Stainless Steel Grade 316", "Aluminum 6061 Alloy", "Aluminum 5083 Alloy", "E-Glass Fiber", "Carbon Fiber", "Structural Wood Lumber"};
	double[] elastic = {29000000, 29000000, 27992000, 10000000, 10440000, 10442700, 33070000, 1900000};
	double[] yields = {36000, 60000, 30000, 40000, 33000, 282000, 500000, 3000};
	String[] cMatNames = new String[100];
	
	Scanner input = new Scanner(System.in);
	
	public Beam(String type){
		if (type == "Rectangle"){
			Rectangle();
			}
		if (type == "Circle"){
			Circle();
			}
		if (type == "Pipe"){
			HollowCircle();
			}
		if (type == "I-Beam"){
			IBeam();
			}
		}
	
	public void Rectangle(){
		System.out.println("\nEnter beam section dimensions:\nEnter Width (inches):");
		width = input.nextDouble();
		System.out.println("\nEnter Height (inches):");
		height = input.nextDouble();
	
		//Find area, section modulus, moment of inertia (MOI)
		
		area = width * height;
		System.out.printf("\nArea: %.3f\n", area);
		
		sm = Math.pow(height, 2) * width / 6;
		System.out.printf("Section Modulus: %.3f\n", sm);
		
		moi = Math.pow(height, 3) * width /12;
		System.out.printf("Moment of Inertia (MOI): %.3f\n", moi);
		
		System.out.println("\nEnter the distance between beam supports as Length (inches):");
		length = input.nextDouble();
		
		load();
	}
		
	public void Circle(){
		System.out.println("\nEnter beam section dimensions:\nEnter Diameter (inches):");
		diameter = input.nextDouble();
		
		area = Math.PI * Math.pow(diameter, 2) /4;
		System.out.printf("\nArea: %.3f\n", area);
		
		sm = Math.PI * Math.pow(diameter, 3) /32;
		System.out.printf("Section Modulus: %.3f\n", sm);
		
		moi = Math.PI * Math.pow(diameter, 4) /64;
		System.out.printf("Moment of Inertia (MOI): %.3f\n", moi);
		
		System.out.println("\nEnter the distance between beam supports as Length (inches):");
		length = input.nextDouble();
		
		load();
		}
	
	public void HollowCircle(){
		System.out.println("\nEnter beam section dimensions:\nEnter Outer Diameter (inches):");
		od = input.nextDouble();
		
		System.out.println("\nEnter Inner Diameter (inches):");
		id = input.nextDouble();
		
		area = Math.pow(od, 2) - Math.pow(id, 2);
		area = area * Math.PI /4;
		System.out.printf("\nArea: %.3f\n", area);
		
		sm = Math.pow(od, 4) - Math.pow(id, 4);
		sm = sm * Math.PI;
		double numy = 32 * od;
		sm = sm / numy;
		System.out.printf("Section Modulus: %.3f\n", sm);
		
		moi = Math.pow(od, 4) - Math.pow(id, 4);
		moi = area * Math.PI /64;
		System.out.printf("Moment of Inertia (MOI): %.3f\n", moi);
		
		System.out.println("\nEnter the distance between beam supports as Length (inches):");
		length = input.nextDouble();
		
		load();
		}
	
	public void IBeam(){
		}
		
	public void load(){
		//Load
		System.out.println("\nEnter the concentrated load at the middle of the beam span (lbs)");
		load = input.nextDouble();
		
		//Bending Moment
		bm = load * length;
		bm = bm / 4;
		System.out.printf("\nBending Moment: %.3f lb-in\n", bm);
		
		//Beam Stress
		stress = bm / sm;
		System.out.printf("Beam Stress: %.3f psi\n\n", stress);
		
		//Material
		System.out.printf("%-30s%-15s%-15s%-23s%-15s%-15s", "Material", "Yield", "Stress (psi)", "Factor of Safety", "Check", "Deflection");
		System.out.println();
		for (int i = 0; i < 115; i++){
			System.out.print("-");
			}
		System.out.println();
		for (int i = 0; i < names.length; i++) {
			fos = yields[i] / stress;
			boolean check = fos >= 1;
			deflection = Math.pow(length, 3) * load;
			double nummm = elastic[i] * moi * 48;
			deflection = deflection / nummm;
			System.out.printf("%-30s%-15.0f%-15.3f%-23.3f%-15s%-15.3e", names[i], yields[i], stress, fos, check, deflection);
			System.out.println();
			}
		}
	public void cMaterial(){
		
		}
	}
