import java.io.FileWriter;
import java.io.IOException;
public class Solicitud {
	private static final String RUTA =
        	"\\\\192.168.0.70\\CarpetaCompartida\\";
	public static void crearSolicitud(
        	String jugador,
        	String tipo) {
    	try {
        	FileWriter fw =
                	new FileWriter(
                        	RUTA + tipo + "_"
                                	+ jugador
                                	+ ".txt");
        	fw.write(jugador);
        	fw.close();
        	System.out.println(
                	tipo + " enviado.");
    	} catch(IOException e) {
        	System.out.println(
                	"Error al enviar solicitud.");
    	}
	}
}
