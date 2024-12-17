package Threads.CriandoThreads;


public class Teste 
{
    public static void main(String[] args) 
    {
		@SuppressWarnings("unused")
		MinhaThread thread = new MinhaThread("#1", 1000);
		
		@SuppressWarnings("unused")
		MinhaThread thread2 = new MinhaThread("#2", 300);
		
		@SuppressWarnings("unused")
		MinhaThread thread3 = new MinhaThread("#3", 100);
	}
}