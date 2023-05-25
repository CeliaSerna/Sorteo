package com.cursoceat.controller;

import java.util.Scanner;

import com.cursoceat.modell.Sorteo;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sorteo<Integer> miSorteo= new Sorteo<>();
		for ( int i=1; i<100; i++) {
			miSorteo.agregar(i);
		}
		System.out.println(miSorteo);
		System.out.println("¿Cuántos números quieres generar?");
		int n= new Scanner(System.in).nextInt();
		System.out.println("Premiados "+miSorteo.premiados(n));
	
		Sorteo<String> miNombre= new Sorteo<>();
		miNombre.agregar("Luna");
		miNombre.agregar("Sol");
		miNombre.agregar("Marte");
		miNombre.agregar("Jupiter");
		miNombre.agregar("Saturno");
		System.out.println(miNombre);
		System.out.println("¿Cuántos números quieres generar para el sorteo? (hasta 5)");
	    n = new Scanner(System.in).nextInt();
	    System.out.println("Premiados "+miNombre.premiados(n));
	
	
	    
	    
	    
	}

}

