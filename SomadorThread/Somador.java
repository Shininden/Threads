package Threads.SomadorThread;

public class Somador 
{
    //Allows it to be used by more than one Thread by alternating who uses it at a certain time
	public synchronized int somaArray(int[] array)
	{
        int total = 0;

        for (int j : array)
		{
            total += j;

            try
			{
                Thread.sleep(300);
				System.out.println("Executando a soma da " + Thread.currentThread().getName() + ": " + "adicionando " + j + " ao somador  (valor do somador agora: " + total + ")");
            }
			catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		return total;
	}
}