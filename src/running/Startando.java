package running;

import java.util.ArrayList;
import java.util.List;

import livraria.Livro;

public class Startando {

	public static List<Livro> compras;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oqueComprei();
		mostrarOqueComprei();
		
	}
	
	
	
	public static  void oqueComprei() {
		compras = new ArrayList<Livro>();
		 
		compras.add(new Livro("Java", 25.50));
		compras.add(new Livro("HTML e CSS", 21.30));
		compras.add(new Livro("Android", 22.54));
		compras.add(new Livro("Revival", 180.54));
		
	}
	
	public static void mostrarOqueComprei() {
		double total = 0;
	    //for
		/*for (int i = 0; i < compras.size(); i++) {
		     total = total + compras.get(i).getValor();
		}*/
		//foreach
		for (Livro livro : compras) {
			total = total + livro.getValor();
		}
		
		//A partir do Java 8 foi introduzido o método forEach() capaz de fazer iterações em lista de forma similar ao enhanced-for
		compras.forEach(livro -> System.out.println(livro.getTitulo() + " - Valor: R$" + livro.getValor()));
		System.out.println("Total: R$" + total );
		
	}
	

}
