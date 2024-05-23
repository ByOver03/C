package ejerciciosprevios;
import java.util.*;
public class Arrays1 {
public static void main(String[]args) {
	//Iniciamos un Scanner para poder registrar la respuesta del usuario proximamente
	Scanner sc= new Scanner(System.in);
	
	//Declaramos los Strings explicacion y bienvenida para explicarle al usuario como va la Aplicacion y que tiene que hacer 
	String explicacion="Bienvenido, en este programa te pediremos un nombre de un personaje \nimportante de la primera trilogia de Star Wars y la consola te dira si esta registrado o no";
	String bienvenida="Introduce un nombre de algun personage de la primera trilogia de Star Wars:";
	//Registramos los nombres de los personajes
	String[] nombres= {"Luke Skywalker","Darth Vader"," Princesa Leia","Han Solo","Yoda"};
	//con esta variable registraremos el nombre que ponga el usuario por la consola
	String nombreusuario;
	//Declaramos encontrado y noencontrado para decirle al usuario si el nombre esta o no
	String encontrado="Este nombre figura en la base de datos";
	String noencontrado="Este nombre no figura en la base de datos";
	//Le damos los mensajes de introduccion al usuario y le pedimos que ingrese un numero
	System.out.println(explicacion+ "\n \n" + bienvenida);
	nombreusuario=sc.nextLine();
	//Le preguntamos si el nombre esta y en caso de que sea cierto le decimos que si sino le diremos que no esta
	if(busquedapersonaje(nombres, nombreusuario)) {
		System.out.println(encontrado);
	}else {
		System.out.println(noencontrado);
	}
	sc.close();
}
//Iniciamos una funcion para determinar si el nombre esta o no
public static boolean busquedapersonaje(String[] personaje,String personajeAux){
	//Hacemos un for each para diferenciar cada nombre que hay en el array de la funvion anterior
	for(String pers:personaje) {
		if(pers.equalsIgnoreCase(personajeAux)) {
			//en caso de que este sea cierto le decimos que devuelva true
			return true;
		}
	}
	//en caso de que nada se cumpla le decimos que devuelva falso
	return false;
}
}
