package hilos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HiloPar hiloP1 = new HiloPar("P1");
	     HiloPar hiloP2 = new HiloPar("P2");
	     HiloImpar hiloI1 =new HiloImpar("I1");
	     HiloImpar hiloI2 =new HiloImpar("I2");
	     
	     hiloP1.start();//Iniciamos
	     hiloP2.start();
	     hiloI1.start();
	     hiloI2.start();

	     try {
			hiloP1.join();//Hacemos que se pause hasta que terminen todos
			hiloP2.join();
		    hiloI1.join();
		    hiloI2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     

	     System.out.println("Todos los hilos han terminado. La suma de todos es:");
	     System.out.println("Suma de los números pares: " + HiloPar.getSumaPares());
	     System.out.println("Suma de los números impares: " + HiloImpar.getSumaImpares());
	     System.out.println("Suma total (pares + impares): " + (HiloPar.getSumaPares() + HiloImpar.getSumaImpares()));
	  
	     
	}

}
