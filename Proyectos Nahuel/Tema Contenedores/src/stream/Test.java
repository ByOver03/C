package stream;

import java.util.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {

		//INTERFAZ STREAM
		
		//TUBERIA O PIPELINE
		
		//A partir de una coleccion:
		//Stream<T> nombreStream = nombreColeccion.stream();
		
		//A partir de un array (de tipo T[]):
		//Stream<T> nombreStream = Stream.of(array);
		//Stream<T> nombreStream = Stream.of(valor1, valor2, ...);
		
		List<String> lista = new ArrayList<>();
		
		lista.add("dado");
		lista.add("arte");
		lista.add("bola");
		lista.add("asa");
		lista.add("buzo");
		lista.add("coche");
		lista.add("barco");
		lista.add("duna");
		
		Cliente[] clientes = {
				new Cliente("Joan", "41411411S", 1970),
				new Cliente("Ana", "54678653G", 2001),
				new Cliente("Pere", "89767347B", 2005),
				new Cliente("Sofia", "15646734H", 1988),
		};
		try {
//		Stream<String> streamCadenas = lista.stream();
//		
//		//filter
//		
//		//Stream<T> filter(Predicate<? Super T> pred)
//		
//		Predicate<String> empiezaPorA = s -> s.startsWith("a");
//		
//		Stream<String> streamA = streamCadenas.filter(empiezaPorA);
//		//Stream<String> streamA = streamCadenas.filter( s -> s.startsWith("a"));
//		
//		//streamA.forEach(System.out::println);
//		
//		Consumer<String> mostrar = s -> System.out.println(s);
//		streamA.forEach(mostrar);
//		
//		
//		streamCadenas.filter( s -> s.startsWith("b")).forEach(mostrar);
			
		//lista.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
			

		
		//Stream<Cliente> streamCliente = Stream.of(clientes);
		//Stream<Cliente> streamCliente = Arrays.stream(clientes);
		
		//Sorted
		//Comparator<Cliente> compCliNombre = (x, y) -> x.nombre.compareTo(y.nombre);
		//Function<Cliente, String> aDNI = c -> c.DNI;
		Arrays.stream(clientes)
							.sorted((x, y) -> x.nombre.compareTo(y.nombre))
							.map(c -> c.DNI)
							.forEach(System.out::println);
		
//		long cuantos = Arrays.stream(clientes)
//							.filter(c -> c.edad > 30)
//							.count();
//		System.out.println(cuantos);
		
		//Stream<Integer> streamEnteros = Stream.of(4, 3, 7, 1, 0, 8, 9, 3, 4, 2, 1, 6, 8, 1, 0, 2, 3);
		
		//distinct()
//		Stream.of(4, 3, 7, 1, 0, 8, 9, 3, 4, 2, 1, 6, 8, 1, 0, 2, 3)
//								.distinct()
//								.forEach(x -> System.out.print(x));
			
//		int sumaEdades = Arrays.stream(clientes)
//							.mapToInt(c -> c.edad)
//							.sum();
		//System.out.println(sumaEdades);
			
//		double mediaEdades = Arrays.stream(clientes)
//				.mapToInt(c -> c.edad)
//				.average()
//				.getAsDouble();
//		System.out.println(mediaEdades);
		
		//max
		//min
		//skip(long n)
		
//		int edadMax = Arrays.stream(clientes)
//				.mapToInt(c -> c.edad)
//				.max()
//				.getAsInt();
//				
//		System.out.println(edadMax);
			
//		int edadMin = Arrays.stream(clientes)
//				.mapToInt(c -> c.edad)
//				.min()
//				.getAsInt();
//					
//		System.out.println(edadMin);
			
//		int edadSkip = Arrays.stream(clientes)
//				.mapToInt(c -> c.edad)
//				.skip(1)
//				.sum();
//					
//		System.out.println(edadSkip);
			
		//reduce()
//		int sumaEdades = Arrays.stream(clientes)
//									.map(Cliente::edad)
//									.reduce(0, (a, b) -> a+b);
//		
//		System.out.println(sumaEdades);
		
			
		//Stream<Integer> streamEnteros = Stream.of(4, 3, 7, 1, 0, 8, 9, 3, 4, 2, 1, 6, 8, 1, 0, 2, 3);
		//Stream<Integer> streamNegativos = Stream.of(-1, -6, -3, -3);
		//concat()
		//Integer[] arrayObject = Stream.concat(streamEnteros, streamNegativos)
		//						.distinct()
	//							.sorted()
		//						.filter(x -> x % 2 == 0)
		//						.toArray(Integer[]::new);
		//System.out.println(Arrays.deepToString(arrayObject));	
		
//		Integer[] arrayDeTipoInteger = Arrays.copyOf(arrayObject, arrayObject.length, Integer[].class);
//		
//		System.out.println(Arrays.deepToString(arrayDeTipoInteger));	
		
//		List<Integer> listanumeros =Stream.of(4, 3, 7, 1, 0, 8, 9, 3, 4, 2, 1, 6, 8, 1, 0, 2, 3)
//								.collect(Collectors.toList());
//		
//		Set<Integer> conjuntoNumeros = Stream.of(4, 3, 7, 1, 0, 8, 9, 3, 4, 2, 1, 6, 8, 1, 0, 2, 3)
//									.collect(Collectors.toCollection(TreeSet::new));
		
//		conjuntoNumeros.add(-10);
//		conjuntoNumeros.add(9);
//		for(Integer i : conjuntoNumeros) {
//			System.out.println(i);
//		}
		
		//double edadMedia = Stream.of(clientes)
		//					.collect(Collectors.averagingInt(c -> c.edad()));
		//System.out.println(edadMedia);
		
		//IntSummaryStatistics sumarioEdad = Stream.of(clientes)
		//					.collect(Collectors.summarizingInt(c -> c.edad()));
		//System.out.println(sumarioEdad);
		
		String nombres = Arrays.stream(clientes)
							.map(c -> c.nombre)
							.collect(Collectors.joining(", "));
		
		System.out.println(nombres);
		}catch (IllegalStateException e) {
			System.out.println("El stream ya habia sido utilizado");
		}
		catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
}

}
