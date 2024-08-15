package Threads.TiqueTaque;

public class ThreadTiqueTaque implements Runnable 
{
	Logic_TiqueTaque logicTT;
	Thread thread;
	
	final int NUM = 5;
	
	public ThreadTiqueTaque(String nome, Logic_TiqueTaque tt)
	{
		thread = new Thread(this, nome);
		this.logicTT = tt;		
		thread.start();
	}

	@Override
	public void run() 
	{
		if (thread.getName().equalsIgnoreCase("Tique"))
		{
			for (int i = 0; i < NUM; i++){
				logicTT.tique(true);
			}

			logicTT.tique(false);
		} 

		else 
		{
			for (int i = 0; i < NUM; i++){
				logicTT.taque(true);
			}

			logicTT.taque(false);
		}
	}
}