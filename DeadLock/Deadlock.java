package Threads.DeadLock;

public class Deadlock 
{
	public static void main(String[] args) 
	{
		final String RECURSO_1 = "Recurso #1";
		final String RECURSO_2 = "Recurso #2";
		
		Thread t1 = new Thread() 
		{
			public void run()
			{
				synchronized (RECURSO_1) 
				{
					System.out.println("Thread #1: bloqueou recurso 1");
					
					try 
					{
						Thread.sleep(100);
					} 
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread #1: tendando o acesso ao recurso 2");
					
					synchronized (RECURSO_2) {
						System.out.println("Thread #1: bloqueou recurso 2");
					}
				}
			}
		};
		
		Thread t2 = new Thread() 
		{
			public void run()
			{
				synchronized (RECURSO_2) 
				{
					System.out.println("Thread #2: bloqueou recurso 2");
					
					try 
					{
						Thread.sleep(100);
					} 
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread #2: tendando o acesso ao recurso 1");
					
					synchronized (RECURSO_1) {
						System.out.println("Thread #2: bloqueou recurso 1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}