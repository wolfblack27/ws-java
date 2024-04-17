package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		
		
		List<Product> products = new ArrayList();
		Product product = new Product("TV", 1200.00);
		products.add(product);
		Product product1 = new Product("Celular", 200.00);
		products.add(product1);
		Product product2 = new Product("Smart", 1000.00);
		products.add(product2);
		
		List<Product> result = products.stream().filter(x -> x.getValue() > 300.00).collect(Collectors.toList());
		for(Product p:products) {
			System.out.println(p);
		}
		
		System.out.println(result);

	}

}

/*
 *Vetor:
 *
 *São estuturas de dados do mesmo tipo:
 * double[] vect = new double[n]; //n -> numero de elementos
 * String[] vect = new String[] {"Maria", "Bob", "Alex"}; //iniciando com valores
 * 
 *For para ler list/array
 *
 * 	for (String nomes : vect) {
	System.out.println(nomes);
}

 * */
 