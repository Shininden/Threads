package Threads.CriandoThreads;

public class MinhaThread implements Runnable
{
	private String name;
	private int sleepTime;
	private final int AMOUNT_REPETITION = 6;

	public MinhaThread(String name, int sleepTime)
	{
		this.name = name;
		this.sleepTime = sleepTime;

		//To turn this class into a Thread, it necessary to pass it as a parameter
		// to a Thread class
		Thread t = new Thread(this);
		t.start();
	}

	//Allows the thread to be executed
	public void run()
	{
		try 
		{
			for (int i = 0; i < AMOUNT_REPETITION; i++)
			{
				System.out.println(name + " contador " + i + "\n");
				Thread.sleep(sleepTime);
			}
		}
		catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(name + " terminou a execução");
	}
}