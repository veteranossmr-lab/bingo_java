import java.util.Scanner;
public class Juego {
	private Carton carton;
	public Juego() {
    	carton = new Carton();
	}
	public void iniciar() {
    	Scanner sc =
            	new Scanner(System.in);
    	System.out.print(
            	"Nombre del jugador: ");
    	String jugador =
            	sc.nextLine();
    	carton.guardarCarton(
            	jugador);
    	System.out.println(
            	"\nCartón creado y guardado.");
    	carton.mostrar();
    	while(true) {
        	System.out.println(
                	"\nIntroduce un número, LINEA o BINGO:");
        	String entrada =
                	sc.nextLine();
        	if(entrada.equalsIgnoreCase(
                	"LINEA")) {
            	Solicitud.crearSolicitud(
                    	jugador,
                    	"LINEA");
            	continue;
        	}
        	if(entrada.equalsIgnoreCase(
                	"BINGO")) {
            	Solicitud.crearSolicitud(
                    	jugador,
                    	"BINGO");
            	continue;
        	}
        	try {
            	int numero =
                    	Integer.parseInt(
                            	entrada);
            	if(carton.marcarNumero(
                    	numero)) {
                	System.out.println(
                        	"Número marcado.");
            	}
            	carton.mostrar();
        	} catch(
                	NumberFormatException e) {
            	System.out.println(
                    	"Entrada no válida.");
        	}
    	}
	}
}

