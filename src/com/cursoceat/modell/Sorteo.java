package com.cursoceat.modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sorteo<T>{
	
	private final Set<T> elementos;
	
	public Sorteo() {
		//en el momento que se construye un objeto tipo sorteo se crea el conjunto
		elementos=new TreeSet<>();
	}
	//por medio de un metodo agregamos elementos y los retornamos
	
	public boolean agregar(T nuevo) {
		
		return elementos.add(nuevo);
	}
	
	//metodo privado esa coleccion elementos creamos
	//1 un nuevo conjunto set llamado premiado
	
	public Set<T> premiados(int cantidadP){
		Set<T> premiados = null;
		List<T> temporal = new ArrayList<>(elementos);
		//la lista temporal se desordena
		Collections.shuffle(temporal);
		//controlar que elementos tenga elementos y que sea mayor que cantidadP
		if(cantidadP<elementos.size()) {
			premiados=new TreeSet<>();
			//insertamos en premiados los primeros elementos que tiene temporal segun la cantidadP
			for (int i=0; i<cantidadP; i++) {
				premiados.add(temporal.get(i));
			}
			}
		return premiados;
		}

	@Override
	public String toString() {
		return "Sorteo [elementos= " + elementos + "]\n";
	}
	
	

}
