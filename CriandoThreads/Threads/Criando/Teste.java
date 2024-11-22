package Threads.CriandoThreads.Threads.Criando;


public class Teste 
{
    public static void main(String[] args) 
    {
		@SuppressWarnings("unused")
		MinhaThread thread = new MinhaThread("#1", 600);
		
		@SuppressWarnings("unused")
		MinhaThread thread2 = new MinhaThread("#2", 900);
		
		@SuppressWarnings("unused")
		MinhaThread thread3 = new MinhaThread("#3", 500);
	}
}