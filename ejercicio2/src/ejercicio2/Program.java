package ejercicio2;

import java.util.Scanner;

public class Program {
	public static void Main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("ingresar nombre: ");
		String name= sc.nextLine();
		name = name.toLowerCase();
		int count=0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
				count= count + 1;
			}
		}
		if(count>=1) {
			System.out.print("'" + name + "' tiene " + count + " vocales");
		}
		else {
			System.out.print("'" + name + "' no tiene vocales");
		}
		sc.close();
	}
}
