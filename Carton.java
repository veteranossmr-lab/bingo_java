
            	usados.add(numero);
            	numeros[i][j] = numero;
        	}
    	}
	}
	public void guardarCarton(
        	String jugador) {
    	try {
        	FileWriter fw =
                	new FileWriter(
                        	"\\\\192.168.0.70\\CarpetaCompartida\\"
                                	+ jugador
                                	+ ".txt");
        	for(int i = 0; i < 3; i++) {
            	for(int j = 0; j < 5; j++) {
                	fw.write(
                        	numeros[i][j] + "");
                	if(j < 4) {
                    	fw.write(",");
                	}
            	}
            	fw.write("\n");
        	}
        	fw.close();
    	} catch(IOException e) {
        	e.printStackTrace();
    	}
	}
	public boolean marcarNumero(
        	int numero) {
    	for(int i = 0; i < 3; i++) {
        	for(int j = 0; j < 5; j++) {
            	if(numeros[i][j]
                    	== numero) {
                	marcados[i][j] = true;
                	return true;
            	}
        	}
    	}
    	return false;
	}
	public void mostrar() {
    	System.out.println();
    	for(int i = 0; i < 3; i++) {
        	for(int j = 0; j < 5; j++) {
            	if(marcados[i][j]) {
                	System.out.printf(
                        	"%-4s",
                        	"XX");
            	} else {
                	System.out.printf(
                        	"%-4d",
                        	numeros[i][j]);
            	}
        	}
        	System.out.println();
    	}
	}
}
