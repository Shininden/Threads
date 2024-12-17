package Threads.ControleExecThred;

public class Teste 
{
	public static void main(String[] args) 
    {
		CtrlThread t1 = new CtrlThread("#A");
		CtrlThread t2 = new CtrlThread("#B");
		
		System.out.println("\n------Pausando a Thread #A------");
		t1.suspend();
		
		try{
            Thread.sleep(200);
		} 
        catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n------Pausando a Thread #B------\n");
		t2.suspend();
		

		System.out.println("------Resumindo a Thread #A------\n");
		t1.resume();
		
		try{
            Thread.sleep(200);
		} 
        catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n------Resumindo a Thread #B------\n");
		t2.resume();
		

		System.out.println("\n------Terminando forçadamente a Thread #B------");
		t2.finish();
	}
}