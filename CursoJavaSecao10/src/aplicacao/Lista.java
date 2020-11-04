package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		lista.add(2, "Marco");

		System.out.println(lista.size());

		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		lista.removeIf(x -> x.charAt(0) == 'M');
		for (String x : lista) {
			System.out.println(x);
		}
		
		//Posição especifica do elemento
		System.out.println("---------------------");
		System.out.println("Posição do Bob: " + lista.indexOf("Bob"));
		System.out.println("Posição do Marco: " + lista.indexOf("Marco"));
		
		//Filtrar somente aqueles que começam com A
		System.out.println("---------------------");
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : resultado) {
			System.out.println(x);
		}
		
		//Primeiro elemento que atende tal condição
		System.out.println("---------------------");
		String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
	}

}
