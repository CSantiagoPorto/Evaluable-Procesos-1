package hilos;

public class HiloImpar extends Thread {
	private String nombre;
	
	public HiloImpar(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
    public void run() {
        int sumaImpares = 0;
        System.out.println(this.nombre + " está generando números impares");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
            System.out.print(i + " ");
            sumaImpares += i;
            }
        }
        System.out.println("\nSuma de los números impares: " + sumaImpares);
    }

}
