package Threads.Semaforo;

public class Controlador 
{
    public static void main(String[] args) {
		
		Sinal semaforo = new Sinal();
		
		for (int i = 0; i < 10; i++)
        {
			System.out.println(semaforo.getCor());
			semaforo.esperaCorMudar();
		}

		semaforo.desligarSemafaro();
	}
}
