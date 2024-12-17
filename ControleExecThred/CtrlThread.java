package Threads.ControleExecThred;

public class CtrlThread implements Runnable 
{
	private String nome;
	private boolean isSuspended;
	private boolean isFinished;

	public CtrlThread(String nome)
	{
		this.nome = nome;
		this.isSuspended = false;

		new Thread(this, nome).start();
	}

	@Override
	public void run() 
	{
		System.out.println("\n------------Executando " + this.nome +  " -----------");

		try 
		{
			for (int i = 0; i < 10; i++)
			{
				System.out.println("Thread " + nome + ", " + " indice " + i);
				Thread.sleep(300);

				//cuz wait(), notify()... requires synchronized methods/blocks
				synchronized (this) 
				{
					while (isSuspended){
						wait();
					}
					if (this.isFinished){
						break;
					}
				}
			}
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("-------------Thread " + this.nome + " terminada---------------\n");
	}
	
	void suspend(){
		this.isSuspended = true;
	}

	synchronized void resume()
	{
		this.isSuspended = false;
		notify();
	}
	
	synchronized void finish()
	{
		this.isFinished = true;
		notify();
	}
}