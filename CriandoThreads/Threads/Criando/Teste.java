package Threads.CriandoThreads.Threads.Criando;


public class Teste 
{
    public static void main(String[] args) 
    {
		MinhaThread thread = new MinhaThread("#1", 600);
		
		MinhaThread thread2 = new MinhaThread("#2", 900);
		
		MinhaThread thread3 = new MinhaThread("#3", 500);
	}
}