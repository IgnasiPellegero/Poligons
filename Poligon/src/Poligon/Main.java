package Poligon;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Poligon> tree = new TreeSet<Poligon>();
		
		Triangle t1 = new Triangle(5, 4);
		Rectangle r1 = new Rectangle(6, 10);
		Quadrat q1 = new Quadrat(8);
		Rectangle r2 = new Rectangle(60, 100);
		
		tree.add(q1);
		tree.add(t1);
		tree.add(r1);
		tree.add(r2);

		System.out.println(tree);

		Iterator<Poligon> it = tree.iterator();
		
		while (it.hasNext()) {
			Poligon p = it.next();
			
			p.calcularArea();
			System.out.println("Area és igual a: "+ p.calcularArea());
		}
	}

}
