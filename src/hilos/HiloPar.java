package hilos;

public class HiloPar extends Thread{
	private String nombre;
	
	 public HiloPar(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	    public void run() {
	        int sumaPares = 0;
	        System.out.println(this.nombre +" Está generando numeros pares:");
	        for (int i = 1; i <= 10; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	                sumaPares += i;//Necesito que sume el nuevo valor al anterior
	                
	            }
	        }
	        
	        System.out.println("\nSuma de los números pares: " + sumaPares);
	    }
	}
	


