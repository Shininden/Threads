package Threads.SomadorThread;

public class Somador 
{
	private int total;
	
	public synchronized int somaArray(int[] array)
	{
		total = 0;
		
		for (int i = 0; i< array.length; i++) 
		{
			total += array[i];

			System.out.println("Executando a soma da " + Thread.currentThread().getName() + " "
					 + array[i] +  " + " + total);

			try 
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return total;
	}
}