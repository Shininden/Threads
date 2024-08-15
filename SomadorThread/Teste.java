package Threads.SomadorThread;

public class Teste 
{
	public static void main(String[] args) 
    {
		int[] array = {1, 2, 3, 4, 5};
		MinhaThreadSoma t1 = new MinhaThreadSoma("1° Thread", array);
		MinhaThreadSoma t2 = new MinhaThreadSoma("2° Thread", array);
	}
}