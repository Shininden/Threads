package Threads.ControleExecThred;

public class Teste 
{
	public static void main(String[] args) 
    {
		CtrlThread t1 = new CtrlThread("#1");
		CtrlThread t2 = new CtrlThread("#2");
		
		System.out.println("\n------Pausando a Thread #1------");
		t1.suspend();
		
		try 
        {
            Thread.sleep(200);
		} 
        catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n------Pausando a Thread #2------");
		t2.suspend();
		

		System.out.println("\n------Resumindo a Thread #1------");
		t1.resume();
		
		try 
        {
            Thread.sleep(200);
		} 
        catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n------Resumindo a Thread #2------");
		t2.resume();
		

		System.out.println("\n------Terminando a Thread #2------");
		t2.finish();
	}
}